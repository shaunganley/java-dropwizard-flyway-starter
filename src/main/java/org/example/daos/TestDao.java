package org.example.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
    public List<String> testConnection() throws SQLException {
        List<String> databases = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            long start = System.currentTimeMillis();

            ResultSet resultSet = statement.executeQuery(
                    "SHOW DATABASES;");

            long end = System.currentTimeMillis();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Database"));
                databases.add(resultSet.getString("Database"));
            }
            System.out.println("Finished retrieving database names");
        }

        return databases;
    }
}
