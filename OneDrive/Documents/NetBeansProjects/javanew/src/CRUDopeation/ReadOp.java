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
public class ReadOp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            //Read operation
            
            String readquery = "SELECT * from accounts";
            PreparedStatement ps4 = con.prepareStatement(readquery);
            
            
             ResultSet rs = ps4.executeQuery();
             System.out.println("entered data are");
             while(rs.next())
             {
                 System.out.println(rs.getInt(1)+"\t"+
                                    rs.getString(2)+"\t"+
                                    rs.getDouble(3));
             }
            
            System.out.println("read succesfully");
         }catch(Exception e){
             e.printStackTrace();

        }
    }
}