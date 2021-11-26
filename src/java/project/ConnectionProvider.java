
package project;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import static java.lang.System.out;
import java.sql.*;

public class ConnectionProvider
{
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ospjsp","root","");
          
            return con;
        } catch (Exception e)
        {
            out.println(e);
            return  null;
        }
    }
            
            
}
