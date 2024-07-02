public class Airline {

    public void bookTicket(String passengerName, String flightNumber) {
        System.out.println("Ticket booked for " + passengerName + " on flight " + flightNumber);
    }

    public void cancelTicket(String ticketNumber) {
        System.out.println("Ticket cancelled: " + ticketNumber);
    }

    public void checkIn(String passengerName) {
        System.out.println("Passenger checked in: " + passengerName);
    }

    public void boardFlight(String passengerName) {
        System.out.println("Passenger boarded: " + passengerName);
    }

    public void serveMeals(String mealDetails) {
        System.out.println("Meals served: " + mealDetails);
    }
}