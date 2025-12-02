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
public class DeleteOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            //Delete operation
            System.out.print("Enter ID to delete : ");
            int deleteid=sc.nextInt();
            
            String deletequery = "DELETE from accounts  WHERE acc_no=?";
            PreparedStatement ps3 = con.prepareStatement(deletequery);
            
            ps3.setInt(1, deleteid);
            
            ps3.execute();
            System.out.println("deleted succesfully");
         }catch(Exception e){
             e.printStackTrace();

        }
    }
}