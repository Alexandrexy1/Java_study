import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preSt = null;

        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            preSt = conn.prepareStatement(
                "UPDATE seller " +
                "SET BaseSalary = ? " +
                "WHERE DepartmentId = ?" 
            );
            
            preSt.setDouble(1, 3200);
            preSt.setInt(2, 1);

            // int num = 1;
            // if (num != 2) {
            //     throw new SQLException("Fake error!");
            // }

            int rowsChanged = preSt.executeUpdate();

            System.out.println("Rows changed: " + rowsChanged); // Rows changed: 2

            conn.commit();
        } catch(SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction error, undone operation by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Roll back error, undone operation by: " + e1.getMessage());
            }
        }

    }
}
