package ArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Event {
    // Event ID
    private String eventID;
    // Event name
    private String eventName;
    // Venue of the event
    private String eventVenue;
    // Date of the event
    private Date eventDate;
    // List of attendees
    private ArrayList<String> eventAttendees;

    // Constructor
    public Event() {
        this.eventAttendees = new ArrayList<>();
    }

    // Setter methods
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    // Getter methods
    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    // Method to add attendees
    public void addAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    // Method to remove an attendee
    public void removeAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    // Method to update an attendee
    public void updateAttendee(String oldAttendee, String newAttendee) {
        int index = eventAttendees.indexOf(oldAttendee);
        if (index != -1) {
            eventAttendees.set(index, newAttendee);
        } else {
            System.out.println("Attendee not found");
        }
    }

    // Method to find an attendee
    public boolean findAttendee(String attendee) {
        return eventAttendees.contains(attendee);
    }

    // Method to organize the event
    public void organizeEvent() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Venue: " + eventVenue);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Total number of attendees: " + eventAttendees.size());
    }

    // toString method
    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }

    public static void main(String[] args) {
        Event event = new Event();

        System.out.println("Enter the event ID:");
        Scanner scanner = new Scanner(System.in);
        String eventID = scanner.nextLine();

        System.out.println("Enter the event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter the event venue:");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter the event date (format: yyyy-MM-dd):");
        String date = scanner.nextLine();
        try {
            event.setEventDate(java.sql.Date.valueOf(date));
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the correct date format (yyyy-MM-dd).");
            return;
        }

        System.out.println("Enter the attendee names (separate by comma):");
        String attendees = scanner.nextLine();
        String[] attendeeNames = attendees.split(",");

        for (String attendee : attendeeNames) {
            event.addAttendee(attendee);
        }

        event.organizeEvent();
    }
}