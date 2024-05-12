import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preSt = null;

        try {
            conn = DB.getConnection();
            preSt = conn.prepareStatement(
                "UPDATE seller " +
                "SET BaseSalary = BaseSalary + ? " +
                "WHERE (DepartmentId = ?) "
            );

            preSt.setDouble(1, 600);
            preSt.setInt(2, 2);

            int rowsChanged = preSt.executeUpdate();

            System.out.println("Rows changed quantity: " + rowsChanged); //output: Rows changed quantity: 4

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preSt);
            DB.closeConnection();
        }
    }
}
