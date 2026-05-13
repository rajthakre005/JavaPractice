import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company",
                "root",
                "password"
            );

        } catch (Exception e) {

            System.out.println("Database Connection Error: " + e);
        }

        return con;
    }
}
