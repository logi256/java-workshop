package main.java.com.java.workshop.temp.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class organizationdao {
    public void createTable (){
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
             e.printStackTrace();
        }
      
        try(Connection connection = DriverManager.getConnection("jdbc:h2:mem:tempdao","sa",null);
            Statement statement = connection.createStatement()) {
            statement.execute("""
                    Create Table Organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    ADDRESS VARCHAR(255))
                    """);
        } catch (SQLException sqlException) {
            System.out.println("Error creating table:"+ sqlException );
        }

    }
}