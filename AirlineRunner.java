public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline = new Airline();
        airline.bookTicket("Kruthika", "AA123");
        airline.cancelTicket("T12345");
        airline.checkIn("Kruthika");
        airline.boardFlight("Kruthika");
        airline.serveMeals("Vegetarian");
    }
}