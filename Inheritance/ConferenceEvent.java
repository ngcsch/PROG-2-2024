package Inheritance;

public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    // Constructor that initializes properties of the parent class and itself
    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    // Rewrite the calculateEventCost method to calculate the cost of the meeting event
    @Override
    public double calculateEventCost() {
        return super.eventCost + breakfastCost + lunchCost + dinnerCost;
    }

    // Override the toString method to print details of the meeting event
    @Override
    public String toString() {
        return "ConferenceEvent{" +
                "breakfastRequired=" + breakfastRequired +
                ", breakfastCost=" + breakfastCost +
                ", lunchRequired=" + lunchRequired +
                ", lunchCost=" + lunchCost +
                ", dinnerRequired=" + dinnerRequired +
                ", dinnerCost=" + dinnerCost +
                ", super=" + super.toString() +
                '}';
    }
}