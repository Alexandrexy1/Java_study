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
                "DELETE FROM department " +
                "WHERE Id = ?" 
            );
            
            preSt.setInt(1, 5);

            int rowsChanged = preSt.executeUpdate();

            System.out.println("Rows changed: " + rowsChanged); // Rows changed: 1
        } catch(SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }

    }
}
