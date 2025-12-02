
package CRUDopeation;
import java.sql.*;
import java.util.Scanner;


public class InsertOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.print("Enter acc no: ");
            int id = sc.nextInt();
            System.out.print("Enter acc holder name: ");
            String name = sc.next();
            System.out.print("Enter amonut: ");
            double amount = sc.nextInt();
            
            String insertQuery = "INSERT INTO accounts VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            
            ps.setInt(1, id);
            ps.setString(2,name);
            ps.setDouble(3,amount);
            
            ps.executeUpdate();
            System.out.println("inserted succesfully");
            
            
            
           
            
        }catch(Exception e)
        {
             e.printStackTrace();

        }
    }
    
}
