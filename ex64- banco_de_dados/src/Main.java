
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.Db;
import db.Db;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement  st = null;

        try {
            conn = Db.getConnection();

            st= conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?, ?, ?, ? , ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Carl Purple");
            st.setString(2, "Carl@gmail.com");
            st.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Pronto! Id = " + id);
                }

            }
            else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            Db.closeStatement(st);
            Db.closeConnection();
        }

    }
}