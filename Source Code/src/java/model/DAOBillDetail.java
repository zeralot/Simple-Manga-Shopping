package model;

import entity.BillDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOBillDetail {

    Connection conn;

    public DAOBillDetail(ConnectionDB conn) {
        this.conn = conn.getConnect();
    }

    public int addBillDetail(BillDetail bd) {
        int n = 0;
        String sql = "INSERT INTO [dbo].[BillDetail]\n"
                + "           ([bid]\n"
                + "           ,[pid]\n"
                + "           ,[quantity]\n"
                + "           ,[price])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, bd.getBid());
            pre.setString(2, bd.getPid());
            pre.setInt(3, bd.getQuantity());
            pre.setDouble(4, bd.getPrice());

            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }
}
