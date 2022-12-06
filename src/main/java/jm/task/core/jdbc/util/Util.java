package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Util {
    private Util() {
    }

    private static String URL = "jdbc:mysql://localhost:3306/kata";
    private static String userName = "root";
    private static String password = "Marcomru007";
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}