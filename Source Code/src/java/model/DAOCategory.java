/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOCategory {

    Connection conn;

    public DAOCategory(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public int addCategory(Category cat) {
        int n = 0;
        String sql = "Insert into Category(cname,status) "
                + "values(?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cat.getCname());
            pre.setInt(2, cat.getStatus());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int updateCategory(Category cat) {
        int n = 0;
        //code here
        String sql = "Update Category set cname=?,status=? where ctid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, cat.getCname());
            pre.setInt(2, cat.getStatus());
            pre.setInt(3, cat.getCtid());

            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int removeCategory(int id) {
        int n = 0;
        String sql = "delete from Category where ctid=" + id;
        try {
            Statement tate = conn.createStatement();
            n = tate.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public ArrayList<Category> getCategory() {
        ArrayList<Category> category = new ArrayList<>();
        try {
            String sql = "Select * from Category";

            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String cname = rs.getString("cname");
                int status = rs.getInt("status");
                int ctid = rs.getInt("ctid");

                category.add(new Category(cname, status, ctid));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;

    }

}
