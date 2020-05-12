package com.example;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        String jdbcUrl = "jdbc:mysql://localhost:3306/world?useSSL=false";
        String username = "root";
        String password = "Secret_123";
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.println(connection.getClass()); // Run-time: com.mysql.jdbc.JDBC4Connection (5.1)
                                                   // com.mysql.cj.jdbc.JDBC4Connection (8)
        PreparedStatement statement = connection.prepareStatement("select * from country where code='TUR'");
        System.out.println(statement.getClass()); // Run-time: com.mysql.jdbc.JDBC42PreparedStatement
        ResultSet rs = statement.executeQuery();
        System.out.println(rs.getClass());
        if (rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("continent"));
            System.out.println(rs.getLong("population"));
        }
    }
}
