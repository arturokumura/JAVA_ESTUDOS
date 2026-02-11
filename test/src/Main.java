import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "2008"
        );

        System.out.println("Conectou!");
        conn.close();
    }
}

