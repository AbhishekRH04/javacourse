/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanew;

/**
 *
 * @author abhis
 */

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc22 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String user = "root";
        String pass = "root";
        Connection con =null;
        try{
            con = DriverManager.getConnection(url,user,pass);
            con.setAutoCommit(false);
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO accounts (acc_no, acc_holder, balance) VALUES (?, ?, ?)");
            ps.setInt(1, 107);
            ps.setString(2,"suhas");
            ps.setDouble(3,5000);
            ps.addBatch();
            
            ps.setInt(1, 108);
            ps.setString(2,"ajith");
            ps.setDouble(3,5000);
            ps.addBatch();
            
            ps.setInt(1, 109);
            ps.setString(2,"amith");
            ps.setDouble(3,5000);            

            ps.addBatch();
            ps.executeBatch();
            
            PreparedStatement debit = con.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE acc_no = ?"
            );
            debit.setDouble(1, 500);
            debit.setInt(2, 101);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE acc_no = ?"
            );
            credit.setDouble(1, 500);
            credit.setInt(2, 202);
            credit.executeUpdate();

            // COMMIT the entire transaction
            con.commit();
            System.out.println("Transaction Successful!");
            
            ResultSet rs = ps.executeQuery("SELECT * FROM accounts");

            while (rs.next()) {
            int acc = rs.getInt("acc_no");
            String name = rs.getString("acc_holder");
            double bal = rs.getDouble("balance");

            System.out.println(acc + " | " + name + " | " + bal);
}
        }
        catch(SQLException e)
        {
            System.out.println("Error Occurred Transaction Rolled Back");
            System.out.println("Reason: " + e.getMessage());
        
        try {
                if (con != null) con.rollback();
            } catch (SQLException ex) {
                System.out.println("Rollback failed: " + ex.getMessage());
            }
        }
    
        finally {
            try {
                if (con != null) con.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
    }
        
    }
}


