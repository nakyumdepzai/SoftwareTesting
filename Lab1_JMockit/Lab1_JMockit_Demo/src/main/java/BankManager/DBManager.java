/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManager;

/**
 *
 * @author nakyumdepzaii
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {

    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=Registration";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "12345";

    public String retrieveLastName(int accountId) {
        String lastName = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT lastname from Registration WHERE accountId = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, accountId);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        lastName = resultSet.getString("lastname");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastName;
    }
}
