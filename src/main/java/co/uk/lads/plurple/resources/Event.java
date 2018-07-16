package co.uk.lads.plurple.resources;

public class Event {
    private int eventId;
    private String eventStartTime;
    private String eventEndTime;
    private String eventLocation;
    private String eventName;
    private String eventDescription;
    private String eventCreationTime;
    private int categoryId;
    private int userId;
    private String eventImage;
    private String somethingElse;

    public Event(int eventId, String eventStartTime, String eventEndTime, String eventLocation, String eventName, String eventDescription, String eventCreationTime, int userid, int categoryId, String eventImage) {
        this.eventId = eventId;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.eventLocation = eventLocation;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventCreationTime = eventCreationTime;
        this.categoryId = categoryId;
        this.eventImage = eventImage;
        this.userId = userid;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventCreationTime() {
        return eventCreationTime;
    }

    public void setEventCreationTime(String eventCreationTime) {
        this.eventCreationTime = eventCreationTime;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getEventImage() {
        return eventImage;
    }

    public void setEventImage(String eventImage) {
        this.eventImage = eventImage;
    }
}
