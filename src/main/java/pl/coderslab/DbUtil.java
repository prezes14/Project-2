package pl.coderslab;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Workshop_2?useSSL=true&characterEncoding=utf8&serverTimezone=UTC";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "coderslab";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
    }
}
