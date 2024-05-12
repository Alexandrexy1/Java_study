import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement preparedSt = null;

        try {
            conn = DB.getConnection();

            preparedSt = conn.prepareStatement(
                "INSERT INTO seller " +
                "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                "VALUES (?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );
            
            preparedSt.setString(1, "Joaozinho Teste");
            preparedSt.setString(2, "Joaozinhoteste12345@teste.com");
            preparedSt.setDate(3, new java.sql.Date(sdf.parse("10/05/2024").getTime()));
            preparedSt.setDouble(4, 3500.0);            
            preparedSt.setInt(5, 2);

            int rowsChange = preparedSt.executeUpdate();

            if (rowsChange > 0) {
                ResultSet resultSet = preparedSt.getGeneratedKeys();

                while(resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Id = " + id); // output: Id = 8
                }

            } else System.out.println("No rows have changed");

        } catch(SQLException e) {
            e.printStackTrace();
        } catch(ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedSt);
            DB.closeConnection();
        }

    

    }
}
