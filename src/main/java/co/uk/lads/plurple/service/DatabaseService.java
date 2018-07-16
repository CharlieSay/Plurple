package co.uk.lads.plurple.service;

import co.uk.lads.plurple.adapter.DatabaseToEvent;
import co.uk.lads.plurple.adapter.DatabaseToUser;
import co.uk.lads.plurple.resources.Event;
import co.uk.lads.plurple.resources.User;

import java.sql.*;
import java.util.Random;
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

    public Event getEvent(int eventId){
        String eventName = null;
        String eventLocation = null;
        String eventDescription  = null;
        int userId = 0;
        String eventCreationTime = null;
        String eventStartTime = null;
        String eventEndTime = null;
        String eventImage = null;
        int categoryId = 0;

        try{
            ResultSet resultSet;
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM 'event' WHERE 'id'= ?")) {
                preparedStatement.setInt(1, eventId);
                resultSet = preparedStatement.executeQuery();
            }
            while (resultSet.next()){
                eventId = resultSet.getInt(1);
                eventLocation = resultSet.getString(2);
                eventName = resultSet.getString(3);
                eventDescription = resultSet.getString(4);
                userId = resultSet.getInt(5);
                eventCreationTime = resultSet.getString(6);
                eventStartTime = resultSet.getString(7);
                eventEndTime = resultSet.getString(8);
                eventImage = resultSet.getString(9);
                categoryId = resultSet.getInt(10);
            }
        }
        catch(SQLException e){
            Logger.getGlobal().log(Level.WARNING,e.toString());
        }
        return DatabaseToEvent.mapEvent(eventId,eventStartTime,eventEndTime,eventLocation,eventName,eventDescription,eventCreationTime,userId,categoryId,eventImage);
    }

    public String getRandomEventImage() {
        DatabaseService databaseService = new DatabaseService();
        Random randomNumber = new Random();
        randomNumber.nextInt(6);
        return databaseService.getEvent(1).getEventImage();
    }
}