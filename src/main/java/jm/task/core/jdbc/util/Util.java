package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "bestuser";
    private static final String PASSWORD = "bestuser";

    public static Connection getConnection () {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            if (!connection.isClosed()) {
//                System.out.println("Соединение установлено!");
//            }
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
        }
        return connection;
    }
}
