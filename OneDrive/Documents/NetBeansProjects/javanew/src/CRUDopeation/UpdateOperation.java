/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUDopeation;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author abhis
 */
public class UpdateOperation {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            //update operation
            System.out.print("Enter ID to Update amount: ");
            int updatid=sc.nextInt();
            System.out.print("Enter New amount: ");
            double amount = sc.nextInt();
            
            String updateQuery = "UPDATE accounts SET balance=? WHERE acc_no=?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);
            ps2.setDouble(1,amount);
            ps2.setInt(2, updatid);
            
            ps2.execute();
            System.out.println("uupdated succesfully");
         }catch(Exception e){
             e.printStackTrace();

        }
    }

}
