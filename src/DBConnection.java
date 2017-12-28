import java.sql.*;

public class DBConnection 
{
    private static final String USERNAME="dba";
    private static final String PASSWORD="dbadmin";
    private static final String CON= "jdbc:mysql://localhost:3306/aadhar_db";
    
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(CON,USERNAME,PASSWORD);
    }
}
