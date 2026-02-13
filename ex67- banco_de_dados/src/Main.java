
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.Db;
import db.Db;
import db.DbIntegrityException;

public class Main {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = Db.getConnection();

            st = conn.prepareStatement(
                   "DELETE FROM department "
                    + "WHERE "
                    +"Id = ?");

            st.setInt(1, 5);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e ) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            Db.closeStatement(st);
            Db.closeConnection();
        }
    }
}