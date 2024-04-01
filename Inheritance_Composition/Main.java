package Inheritance_Composition;

public class Main {

    public static void main(String[] args) throws Exception {

        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);

        conferenceEvent.calculateEventCost();

        System.out.println(conferenceEvent);

        MusicEvent musicEvent = new MusicEvent("E002", "Rock Concert", "London", "John Smith", 100, 3, 50);

        musicEvent.calculateEventCost();

        System.out.println(musicEvent);

        PastEvents pastEvent = new PastEvents("E003", "Gala Dinner", "New York", "Emily Brown", 200, 1);

        pastEvent.setPaymentDetails("Paid", true);


        System.out.println(pastEvent);

    }
}