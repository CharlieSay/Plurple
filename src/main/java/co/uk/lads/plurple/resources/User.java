package co.uk.lads.plurple.resources;


public class User {
    private int userId;
    private String userName;
    private String userDisplayName;

    public User(int userId, String userName, String userDisplayName) {
        this.userId = userId;
        this.userName = userName;
        this.userDisplayName = userDisplayName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }
}