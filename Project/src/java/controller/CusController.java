/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
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
import javax.servlet.http.HttpSession;
import model.ConnectionDB;
import model.DAOCustomer;

/**
 *
 * @author DELL
 */
public class CusController extends HttpServlet {

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
        DAOCustomer dao = new DAOCustomer(conDB);
        try (PrintWriter out = response.getWriter()) {
            String service = request.getParameter("service");
            if (service == null || service.equals("")) {
                service = "displayAll";
            }
            if (service.equals("displayAll")) {
                //display all Customer
                ResultSet rs = conDB.getData("Select * from Customer");
                request.setAttribute("rs", rs);

                Vector<Customer> vector = new Vector<>();
                try {
                    while (rs.next()) {
                        Customer cus = new Customer(rs.getInt(1),
                                rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5),
                                rs.getString(6), rs.getString(7),
                                rs.getInt(8));
                        vector.add(cus);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CusController.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("vector", vector);

                //RequestDispatcher dispatcher =
                // getServletContext().getRequestDispatcher("/DisplayCustomer.jsp");
                // dispatcher.forward(request, response);
                dispatch(request, response, "/DisplayCustomer.jsp");
            }
            if (service.equals("preUpdate")) {
                String id = request.getParameter("id");
                int cid = Integer.parseInt(id);
                ResultSet rs = conDB.getData("select * from Customer where cid=" + cid);
                try {
                    if (rs.next()) {
                        Customer cus = new Customer(rs.getInt(1),
                                rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5),
                                rs.getString(6), rs.getString(7),
                                rs.getInt(8));
                        request.setAttribute("cus", cus);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CusController.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispatch(request, response, "/updateCustomer.jsp");
            }
            if (service.equals("update")) {
                //check data
                int id = Integer.parseInt(request.getParameter("cid"));
                String fname = request.getParameter("fname");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                String status = request.getParameter("status");
                int sta = Integer.parseInt(status);
                //create object
                Customer cus = new Customer(id, fname, address, email, phone, userName, password, sta);
                dao.updateCustomer(cus);
                response.sendRedirect("CusController");
            }
            if (service.equals("delete")) {
                String id = request.getParameter("id");
                int cid = Integer.parseInt(id);
                //check foreign key contrain
                String sql = "select * from Customer join Bill on Customer.cid=bill.cid\n"
                        + "where Customer.cid=" + cid;
                ResultSet rs = conDB.getData(sql);
                try {
                    if (rs.next()) {
                        // change status from 1 to 0
                    } else {
                        //delete
                        dao.removeCustomer(cid);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CusController.class.getName()).log(Level.SEVERE, null, ex);
                }

                response.sendRedirect("CusController");

            }
            if (service.equals("register")) {
                String fname = request.getParameter("fname");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                String status = request.getParameter("status");
                //check value

                //convert
                int sta = Integer.parseInt(status);
                //create object
                Customer cus = new Customer(fname, address, email, phone, userName, password, sta);
                int n = dao.addCustomer(cus);
                if (n > 0) {
                    out.println("Inserted");
                    //
                    response.sendRedirect("Login.jsp");
                } else {
                    out.println("error");
                }
            }
            if (service.equals("login")) {
                HttpSession session = request.getSession();
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                if (dao.isValid(userName, password)) {
                    session.setAttribute("userName", userName);
                    session.setAttribute("password", password);
                    
                    response.sendRedirect("ProControllerClient");
                } else {

                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);
                }

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
