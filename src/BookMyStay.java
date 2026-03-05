import java.util.*;

class BookMyStay {

    Queue<String> bookingQueue;

    BookMyStay() {
        bookingQueue = new LinkedList<>();
    }

    void addRequest(String guestName, String roomType) {
        String request = guestName + " requested " + roomType + " room";
        bookingQueue.add(request);
    }

    void showRequests() {
        System.out.println("\nBooking Requests in Queue:");
        for (String req : bookingQueue) {
            System.out.println(req);
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Book My Stay App   ");
        System.out.println("   Hotel Booking System v5.0     ");
        System.out.println("=================================");

        BookMyStay app = new BookMyStay();

        app.addRequest("Amit", "Standard");
        app.addRequest("Priya", "Deluxe");
        app.addRequest("Rahul", "Suite");

        app.showRequests();
    }
}