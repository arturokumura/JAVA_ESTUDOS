
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.Db;
import db.Db;

public class Main {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = Db.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    +"WHERE "
                    +"(DepartmentId =?)");

            st.setDouble(1,200.0);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e ) {
            e.printStackTrace();
        }
        finally {
            Db.closeStatement(st);
            Db.closeConnection();
        }
    }
}