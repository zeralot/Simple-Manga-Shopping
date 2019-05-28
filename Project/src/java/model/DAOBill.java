/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOBill {

    Connection conn;

    public DAOBill(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public int addBill(Bill bi) {
        int n = 0;
        String sql = "Insert into Bill(cdate,rname,"
                + "rAddress,rphone,total,status,cid) "
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, bi.getCdate());
            pre.setString(2, bi.getRname());
            pre.setString(3, bi.getrAddress());
            pre.setString(4, bi.getRphone());
            pre.setDouble(5, bi.getTotal());
            pre.setInt(6, bi.getStatus());
            pre.setInt(7, bi.getCid());

            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int createBill(int cid,String rname,String rAddress, String rphone){
        int n = 0;
        String sql = "Insert into Bill(rname,rAddress,rphone,cid) "
                + "values(?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pre.setString(1, rname);
            pre.setString(2, rAddress);
            pre.setString(3, rphone);
            
            pre.setInt(4, cid);
            n = pre.executeUpdate();
            ResultSet rs = pre.getGeneratedKeys();
            if(rs.next()){
                n = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }
    
    

    public int updateBill(Bill bi) {
        int n = 0;
        //code here
        String sql = "Update Bill set cdate=?,rname=?,rAddress=?,"
                + "rphone=?,total=?,status=?,cid=? where bid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, bi.getCdate());
            pre.setString(2, bi.getRname());
            pre.setString(3, bi.getrAddress());
            pre.setString(4, bi.getRphone());
            pre.setDouble(5, bi.getTotal());
            pre.setInt(6, bi.getStatus());
            pre.setInt(7, bi.getCid());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
     public int updateBill(int bid,double total) {
        int n = 0;
        //code here
        String sql = "Update Bill set total=? where bid=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);       
            pre.setDouble(1, total);
            pre.setInt(2, bid);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int removeBill(int id) {
        int n = 0;
        String sql = "delete from Bill where bid=" + id;
        try {
            Statement tate = conn.createStatement();
            n = tate.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOBill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }
}
