/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ConnectionDB {
    private Connection conn=null;
    public ConnectionDB(String URL,String userName,String pass){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(URL, userName, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ConnectionDB(){
        this("jdbc:sqlserver://localhost:1433;databaseName=IA1102",
                "sa","123456");
        System.out.println("Connected");
    }
    public static void main(String[] args) {
        new ConnectionDB();
    }
    public Connection getConnect(){
        return conn;
    }
    public ResultSet getData(String sql){
        ResultSet rs=null;
        try {
            Statement state=conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            rs=state.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
}
