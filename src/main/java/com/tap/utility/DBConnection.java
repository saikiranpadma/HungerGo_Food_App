package com.tap.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Use explicit params in the URL (adjust serverTimezone/SSL as needed)
    private static final String URL = "jdbc:mysql://localhost:3306/food_app?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sai@1919";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Connection Established Successfully");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found. Add MySQL Connector/J to classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed! SQLState: " + e.getSQLState() + ", ErrorCode: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            // e.g. Unknown database -> SQLState 42000 and message Unknown database '...'
            e.printStackTrace();
        }
        return connection;
    }
}
