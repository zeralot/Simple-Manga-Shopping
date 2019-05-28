/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huytq
 */
public class DAOAdmin {

    Connection conn;

    public DAOAdmin(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public boolean isValid(String user, String pass) {
        boolean status = false;
        String sql = "select * from admin where username=? AND password=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
