package main.java.com.java.workshop.temp.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import main.java.com.java.workshop.temp.bin.Orgranaization;

public class organizationdao {
    public void createTable(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("""
                    CREATE TABLE Organization (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        website VARCHAR(100),
                        email VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT,
                        ADDRESS VARCHAR(100)
                    )
                    """);
        } catch (SQLException sqlException) {
            System.out.println("Error creating table: " + sqlException);
        }
    }

    public int save(Connection connection, Orgranaization vet) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("""
                insert into organization (name, website, email, contact_number,
                registration_no, address) values (?, ?, ?, ?, ?, ?)
                """)) {

            preparedStatement.setString(1, vet.name());
            preparedStatement.setString(2, vet.website());
            preparedStatement.setString(3, vet.email());
            preparedStatement.setInt(4, vet.contactNumber());
            preparedStatement.setInt(5, vet.registrationNumber());
            preparedStatement.setString(6, vet.address());
            return preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("Error insertting into table:" + sqlException);
        }
        return 0;
    }

    public Orgranaization findByName(Connection connection, String name) {
        Orgranaization organization = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("""
                select * from organization where name = ?
                """)) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                organization = new Orgranaization(resultSet.getString("name"), name, 0, name, name, 0, null);
                resultSet.getString("address");
                resultSet.getString("contact_number");
                resultSet.getString("email");
                resultSet.getString("website");
            }
        } catch (Exception e) {

        }
        return organization;
    }
}