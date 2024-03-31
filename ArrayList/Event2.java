package ArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Event2 {

    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    // constructor
    public Event2() {
        this.eventAttendees = new ArrayList<>();
    }

    // Constructor, with arguments
    public Event2(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
    }

    // Method for obtaining the event ID
    public String getEventID() {
        return eventID;
    }

    // Method for setting the event ID
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    // Method to get the event name
    public String getEventName() {
        return eventName;
    }

    // Method for setting the event name
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    // Method of getting event location
    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    // Method to get the event date
    public Date getEventDate() {
        return eventDate;
    }

    // A way to set the event date
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    // Method to get a list of event participants
    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }
    
    //Methods for adding event participants
    public void addEventAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    // Method for removing event participants
    public void removeEventAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    // Methods for updating event participants
    public void updateEventAttendee(String oldAttendee, String newAttendee) {
        int index = eventAttendees.indexOf(oldAttendee);
        if (index!= -1) {
            eventAttendees.set(index, newAttendee);
        }
    }

    // Ways to find event participants
    public boolean findEventAttendee(String attendee) {
        return eventAttendees.contains(attendee);
    }

    // A way to organize events
    public void organizeEvent() {
        System.out.println("event ID：" + eventID);
        System.out.println("eventName：" + eventName);
        System.out.println("eventVenue：" + eventVenue);
        System.out.println("eventDate：" + eventDate);
        System.out.println("eventAttendees：" + eventAttendees.size());
    }

    // toString Method to print object information
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

        // Gets the event information entered by the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an event ID：");
        event.setEventID(scanner.nextLine());

        System.out.print("Please enter an eventName：");
        event.setEventName(scanner.nextLine());

        System.out.print("Please enter an eventVenue：");
        event.setEventVenue(scanner.nextLine());

        System.out.print("Please enter the event date（yyyy-MM-dd）：");
        String date = scanner.nextLine();
        try {
            event.setEventDate(new Date(date));
        } catch (Exception e) {
            System.out.println("Invalid date format, please re-enter.");
            return;
        }

        // Allows users to add, remove, update, and find participants
        while (true) {
            System.out.println("1. Add a participant");
            System.out.println("2. Remove participant");
            System.out.println("3. Update participant");
            System.out.println("4. Find a participant");
            System.out.println("5. over");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newlines in the input buffer

            if (choice == 1) {
                System.out.print("Please enter the name of the participant you want to add：");
                String attendee = scanner.nextLine();
                event.addEventAttendee(attendee);
            } else if (choice == 2) {
                System.out.print("Please enter the name of the participant you want to remove：");
                String attendeeToRemove = scanner.nextLine();
                event.removeEventAttendee(attendeeToRemove);
            } else if (choice == 3) {
                System.out.print("Please enter the old participant name that you want to update：");
                String oldAttendee = scanner.nextLine();
                System.out.print("Please enter the name of the new participant to update：");
                String newAttendee = scanner.nextLine();
                event.updateEventAttendee(oldAttendee, newAttendee);
            } else if (choice == 4) {
                System.out.print("Please enter the name of the participant you are looking for：");
                String attendeeToFind = scanner.nextLine();
                if (event.findEventAttendee(attendeeToFind)) {
                    System.out.println("Participants found " + attendeeToFind);
                } else {
                    System.out.println("Participant not found " + attendeeToFind);
                }
            } else if (choice == 5) {
                break;
            }
        }

        // Organize events and print results
        event.organizeEvent();
    }
}