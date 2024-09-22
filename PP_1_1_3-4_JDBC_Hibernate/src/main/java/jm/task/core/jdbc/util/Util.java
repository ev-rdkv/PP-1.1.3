package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DRIVER = "java.sql.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/evrdkv";
    private static final String USERNAME = "evrdkv";
    private static final String PASSWORD = "03021966Evgesh";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка соединения");
        }
        return connection;
    }
}
