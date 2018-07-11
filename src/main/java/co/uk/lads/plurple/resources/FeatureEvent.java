package co.uk.lads.plurple.resources;

public class FeatureEvent {
    private int featureEventId;
    private int eventId;

    public FeatureEvent(int featureEventId, int eventId) {
        this.featureEventId = featureEventId;
        this.eventId = eventId;
    }

    public int getFeatureEventId() {
        return featureEventId;
    }

    public void setFeatureEventId(int featureEventId) {
        this.featureEventId = featureEventId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
