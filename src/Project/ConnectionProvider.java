

package Project;
import java.sql.*;

/**
 *
 * @author osand
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Osanda@16052");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}