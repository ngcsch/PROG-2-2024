package Inheritance_Composition;

public class PastEvents extends Event{

    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private double pastEventCost;

    public PastEvents(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {

        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays, totalEventDays);
        
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public void caculateCost(){
        int tax;
        double cost = 1000 + (1000 * tax);
    }

    public void setPaymentDetails(String paymentStatus,boolean requiresExtension){
        this.paymentDetails = "The event cost was" + pastEventCost + "and the payment status is" + paymentStatus + "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }
    @Override
    public double calculateEventCost(){
        super.calculateEventCost();
        pastEventCost = calculateEventCost();
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " +  pastEventCost + " and the payment status is " + paymentStatus + 
        "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "The payment details are as follows: " + "\n" + 
        paymentDetails;
    }
    
}