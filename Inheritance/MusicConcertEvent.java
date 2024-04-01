package Inheritance;

public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    // Constructor that initializes properties of the parent class and itself
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    // Rewrite the calculateEventCost method to calculate the cost of a music concert event
    @Override
    public double calculateEventCost() {
        return super.eventCost + merchandiseCost;
    }

    // Override the toString method to print details of music concert events
    @Override
    public String toString() {
        return "MusicConcertEvent{" +
                "merchandiseRequired=" + merchandiseRequired +
                ", merchandiseCost=" + merchandiseCost +
                ", super=" + super.toString() +
                '}';
    }
}