package co.uk.lads.plurple.service;

import co.uk.lads.plurple.adapter.DatabaseToEvent;
import co.uk.lads.plurple.adapter.DatabaseToUser;
import co.uk.lads.plurple.resources.Event;
import co.uk.lads.plurple.resources.User;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseService {

    private final String databaseUrl = "jdbc:mysql://db-workshop.public-dev.zuto.cloud:3306/bootcamp1";
    private final String databaseUsername = "bootcamp1";
    private final String datbaseSchema = "readonly";
    private final String databasePwd = "LlamaPancakes";
    private Connection connection;

    public DatabaseService() {
        try{
            connection = DriverManager.getConnection(databaseUrl,"bootcamp1","LlamaPancakes");
        }catch(SQLException e){
            Logger.getGlobal().log(Level.WARNING,e.toString());
        }
    }

    public User getUser(String givenUsername){
        Integer id = null;
        String userName = null;
        String displayName = null;
        try{
            ResultSet resultSet;
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM 'user' WHERE 'username'= ?")) {
                preparedStatement.setString(1, givenUsername);
                resultSet = preparedStatement.executeQuery();
            }
            while (resultSet.next()){
                id = resultSet.getInt(1);
                userName = resultSet.getString(2);
                displayName = resultSet.getString(3);
            }
        }
        catch(SQLException e){
            Logger.getGlobal().log(Level.WARNING,e.toString());
        }
        return DatabaseToUser.mapUser(id,userName,displayName);
    }

    public Event getEvent(String eventId){
        /*
        Make Connection
         */
        return DatabaseToEvent.mapEvent();
    }
}
