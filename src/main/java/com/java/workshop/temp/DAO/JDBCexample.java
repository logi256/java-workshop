package main.java.com.java.workshop.temp.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import main.java.com.java.workshop.temp.bin.Orgranaization;

public class JDBCexample {

    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("org.h2.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", null);
        }catch (SQLException SQLException){
            System.out.println("Error creating table " + SQLException);
        }

        organizationdao  organizationDao = new organizationdao();
        organizationDao.createTable(connection);
        Orgranaization vet = new Orgranaization("vet","thindal,Erode",94894408,
        "vetal@gmail.com","www.vetias.com",78656786,null);
        organizationDao.save(connection,vet);
        

    }


}