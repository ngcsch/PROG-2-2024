package Inheritance_Composition;

public class ConferenceEvent extends Event {

    private double conferenceEventCost;

    private CalculateEvent calculateEventCostObject;

    private double breakfastCost;

    private double lunchCost;

    private double dinnerCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact,
            int totalParticipants, int totalEventDays, double breakfastCost, double lunchCost, double dinnerCost) {

        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays, totalEventDays);

        this.calculateEventCostObject = new CalculateEvent();

        this.breakfastCost = breakfastCost;

        this.lunchCost = lunchCost;

        this.dinnerCost = dinnerCost;

    }

    @Override

    public void calculateEventCost() {

        super.calculateEventCost();

        double eventCost = calculateEventCostObject.calculateEventCost()
                + (calculateEventCostObject.calculateEventCost() * 0.3);

        conferenceEventCost = eventCost
                + ((breakfastCost + lunchCost + dinnerCost) * getTotalParticipants() * getTotalEventDays());

    }

    private double getTotalEventDays() {
        throw new UnsupportedOperationException("Unimplemented method 'getTotalEventDays'");
    }

    private double getTotalParticipants() {
        throw new UnsupportedOperationException("Unimplemented method 'getTotalParticipants'");
    }

    @Override

    public String toString() {

        return "Conference Event details: " + "\n" +

                "Event ID: " + getEventID() + "\n" +

                "Event Name: " + getEventName() + "\n" +

                "Event Location: " + getEventLocation() + "\n" +

                "Total participants: " + getTotalParticipants() + "\n" +

                "Total Conference Cost: " + conferenceEventCost;

    }

    private String getEventLocation() {
        throw new UnsupportedOperationException("Unimplemented method 'getEventLocation'");
    }

    private String getEventName() {
        throw new UnsupportedOperationException("Unimplemented method 'getEventName'");
    }

    private String getEventID() {
        throw new UnsupportedOperationException("Unimplemented method 'getEventID'");
    }

}