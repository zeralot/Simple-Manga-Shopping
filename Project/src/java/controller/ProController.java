/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ConnectionDB;
import model.DAOProduct;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProController extends HttpServlet {

    private void dispatch(HttpServletRequest request,
            HttpServletResponse response, String page)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ConnectionDB conDB = new ConnectionDB();
        DAOProduct dao = new DAOProduct(conDB);
        try (PrintWriter out = response.getWriter()) {
            //check service
            String service = request.getParameter("service");
            if (service == null || service.equals("")) {
                service = "displayAll";
            }
            if (service.equals("displayAll")) {
                //display all Customer
                ResultSet rs = conDB.getData("Select * from Product");
                request.setAttribute("rs", rs);

                Vector<Product> vector = new Vector<>();
                try {
                    while (rs.next()) {
                        Product pro = new Product(rs.getString(1),
                                rs.getString(2), rs.getInt(3),
                                rs.getDouble(4), rs.getString(5),
                                rs.getString(6), rs.getInt(7), rs.getInt(8)
                        );
                        vector.add(pro);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ProController.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("vector", vector);

                //RequestDispatcher dispatcher =
                // getServletContext().getRequestDispatcher("/DisplayCustomer.jsp");
                // dispatcher.forward(request, response);
                dispatch(request, response, "/DisplayProduct.jsp");
            }
            if (service.equals("preUpdate")) {
                String pid = request.getParameter("id");

                ResultSet rs = conDB.getData("select * from Product where pid='" + pid + "'");
                try {
                    if (rs.next()) {
                        Product pro = new Product(rs.getString(1),
                                rs.getString(2), rs.getInt(3),
                                rs.getDouble(4), rs.getString(5),
                                rs.getString(6), rs.getInt(7), rs.getInt(8)
                        );
                        request.setAttribute("pro", pro);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ProController.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispatch(request, response, "/updateProduct.jsp");
            }
            if (service.equals("update")) {
                //check data
                System.out.println("1");
                String pid = request.getParameter("pid");
                String pname = request.getParameter("pname");
                String quantity = request.getParameter("quantity");
                String price = request.getParameter("price");
                String description = request.getParameter("description");
                String images = request.getParameter("images");
                String ctid = request.getParameter("Categories2");
                String status = request.getParameter("status");
                //check value
                //convert
                double pri = Double.parseDouble(price);
                int sta = Integer.parseInt(status);
                int quan = Integer.parseInt(quantity);
                int ctid2 = Integer.parseInt(ctid);
                System.out.println("2");
                //create object
                Product pro = new Product(pid, pname, quan, pri, images, description, sta, ctid2);
                dao.updateProduct(pro);
                System.out.println("3");
                response.sendRedirect("ProController");
            }
            if (service.equals("delete")) {
                String pid = request.getParameter("id");
                String sql = "select * from Product join BillDetail on Product.pid=BillDetail.pid\n"
                        + "where Product.pid='" + pid + "'";
                ResultSet rs = conDB.getData(sql);
                try {
                    if (rs.next()) {
                        // change status from 1 to 0
                    } else {
                        //delete
                        dao.removeProduct(pid);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ProController.class.getName()).log(Level.SEVERE, null, ex);
                }
                response.sendRedirect("ProController");

            }
            if (service.equals("register")) {
                String pid = request.getParameter("pid");
                String pname = request.getParameter("pname");
                String quantity = request.getParameter("quantity");
                String price = request.getParameter("price");
                String images = request.getParameter("images");
                String description = request.getParameter("description");
                String ctid = request.getParameter("Categories");
                String status = request.getParameter("status");
                //check value

                //convert
                double pri = Double.parseDouble(price);
                int sta = Integer.parseInt(status);
                int quan = Integer.parseInt(quantity);
                int ctid2 = Integer.parseInt(ctid);
                //create object
                Product pro = new Product(pid, pname, quan, pri, images, description, sta, ctid2);
                int n = dao.addProduct(pro);
                response.sendRedirect("ProController");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
