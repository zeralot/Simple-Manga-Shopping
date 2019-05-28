/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ConnectionDB;
import model.DAOAdmin;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LoginController extends HttpServlet {

  



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ConnectionDB conDB = new ConnectionDB();
        DAOAdmin dao = new DAOAdmin(conDB);
        HttpSession session = request.getSession();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        if (dao.isValid(userName, password)) {
            session.setAttribute("userName", userName);
            session.setAttribute("password", password);
            RequestDispatcher rd = request.getRequestDispatcher("AdminScreen.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("LoginAdmin.jsp");
            rd.forward(request, response);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
