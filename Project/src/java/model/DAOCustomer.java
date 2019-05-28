/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DAOCustomer {
    // ConnectionDB connDB;

    Connection conn;

    public DAOCustomer(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public int addCustomer(Customer cus) {
        int n = 0;
        String sql = "Insert into Customer(fullname,address,email,"
                + "phone,username,password,status) "
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cus.getFullname());
            pre.setString(2, cus.getAddress());
            pre.setString(3, cus.getEmail());
            pre.setString(4, cus.getPhone());
            pre.setString(5, cus.getUsername());
            pre.setString(6, cus.getPassword());
            pre.setInt(7, cus.getStatus());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int updateCustomer(Customer cus) {
        int n = 0;
        //code here
        String sql = "Update Customer set fullname=?,address=?,email=?,"
                + "phone=?,username=?,password=?,status=? where cid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cus.getFullname());
            pre.setString(2, cus.getAddress());
            pre.setString(3, cus.getEmail());
            pre.setString(4, cus.getPhone());
            pre.setString(5, cus.getUsername());
            pre.setString(6, cus.getPassword());
            pre.setInt(7, cus.getStatus());
            pre.setInt(8, cus.getCid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int removeCustomer(int id) {
        int n = 0;
        String sql = "delete from Customer where cid=" + id;
        try {
            Statement tate = conn.createStatement();
            n = tate.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public boolean isValid(String user, String pass) {
        boolean status = false;
        String sql = "select * from Customer where username=? AND password=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
     
     
     
}
