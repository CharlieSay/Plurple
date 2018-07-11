package co.uk.lads.plurple.adapter;

import co.uk.lads.plurple.resources.User;

public class DatabaseToUser {

    public final static User mapUser(Integer id, String userName, String displayName){
        return new User(id,userName,displayName);
    }

}
