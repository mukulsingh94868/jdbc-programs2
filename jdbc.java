package mortal2;
import java.sql.*;
public class Mortal2
  
{
     static final String jdbc_Driver="com.mysql.cj.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/mukki1";
    static final String USER="root";
    static final String PWD="Facebook1";
  
    public static void main(String args[])
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL,USER,PWD);
            stmt=conn.createStatement();
               String sql="SELECT name,address,pincode FROM mukki1 ";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                String name=rs.getString("name");
                String address=rs.getString("address");
                int pincode=rs.getInt("pincode");
                System.out.println("name"+name);
                System.out.println("address"+address);
                System.out.println("pincode"+pincode);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        finally
        {
                try
                {
                if(stmt!=null)
                    stmt.close();
                }
                catch(SQLException se2)
                {
                
                try
                  {
                    if(conn!=null)
                     conn.close();
                  }
                catch(SQLException se)
                 {
                     se.printStackTrace();
                 }
                 }
                 System.out.println("bye good bye");
                  
        }               
                      
                
                        
    }
    
}