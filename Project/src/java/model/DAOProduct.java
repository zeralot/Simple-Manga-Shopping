/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOProduct {

    Connection conn;

    public DAOProduct(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public int addProduct(Product pro) {
        int n = 0;
        String sql = "Insert into Product(pid,pname,quantity,price,images,description,status,ctid) "
                + "values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, pro.getPid());
            pre.setString(2, pro.getPname());
            pre.setInt(3, pro.getQuantiy());
            pre.setDouble(4, pro.getPrice());
            pre.setString(5, pro.getImages());
            pre.setString(6, pro.getDescription());
            pre.setInt(7, pro.getStatus());
            pre.setInt(8, pro.getCtid());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int updateProduct(Product pro) {
        int n = 0;
        //code here
        String sql = "Update Product set pname=?,quantity=?,"
                + "price=?,images=?,description=?,status=?,ctid=? where pid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(8, pro.getPid());
            pre.setString(1, pro.getPname());
            pre.setInt(2, pro.getQuantiy());
            pre.setDouble(3, pro.getPrice());
            pre.setString(4, pro.getImages());
            pre.setString(5, pro.getDescription());
            pre.setInt(6, pro.getStatus());
            pre.setInt(7, pro.getCtid());

            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int removeProduct(String id) {
        int n = 0;
        String sql = "delete from Product where pid='" + id + "'";
        try {
            Statement tate = conn.createStatement();
            n = tate.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

}
