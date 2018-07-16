package co.uk.lads.plurple.adapter;

import co.uk.lads.plurple.resources.Event;

public class DatabaseToEvent {

    public final static Event mapEvent(int eventId,
                                       String eventStartTime,
                                       String eventEndTime,
                                       String eventLocation,
                                       String eventName,
                                       String eventDescription,
                                       String eventCreationTime,
                                       int userId,
                                       int categoryId,
                                       String eventImage){
        return new Event(eventId,eventStartTime,eventEndTime,eventLocation,eventName,eventDescription,eventCreationTime,userId,categoryId,eventImage);
    }

}
