import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlTest {
    public static void main(String[] args) {
        try {
           

            String url = "jdbc:pointbase://localhost/cs595";
            String dbUser = "PBPUBLIC";
            String dbPassword = "PBPUBLIC";

            Connection con = DriverManager.getConnection(url, dbUser, dbPassword);

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
