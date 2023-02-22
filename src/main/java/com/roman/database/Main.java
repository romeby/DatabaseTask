package com.roman.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ok");
    }
}
