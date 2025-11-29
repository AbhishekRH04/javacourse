package javanew;

import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        String username="root";
        String password="root";
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String query ="select * from school where sid=1";
        
        try{
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,password);

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        if (rs.next()) {
        int sid = rs.getInt("sid");
        String teacher = rs.getString("teacher");
        String students = rs.getString("students");
        String department = rs.getString("department");
        System.out.println("SID : " + sid);
        System.out.println("Teacher : " + teacher);
        System.out.println("Students : " + students);
        System.out.println("Department : " + department);
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
