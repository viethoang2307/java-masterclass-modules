import java.sql.*;

public class Module11Example {
    static void insertExpense(Connection connection, String userId, int amount)
            throws SQLException {
        String sql = "INSERT INTO expenses(user_id, amount) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userId);
            statement.setInt(2, amount);
            statement.executeUpdate();
        }
    }
    public static void main(String[] args) {
        System.out.println("JDBC example requires a configured DataSource/driver.");
    }
}