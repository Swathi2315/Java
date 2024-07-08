public class MetroRunner {
    public static void main(String[] args) {
	    Metro.checkSchedule("Red Line");
        Metro.checkSchedule("Red Line", "Central Station");
        Metro.buyTicket("Station A", "Station B");
        Metro.buyTicket("Station A", "Station B", 2);
        Metro.checkFare("Station A", "Station B");
        Metro.checkFare("Station A", "Station B", "regular");
        Metro.locateStation("Central Station");
        Metro.locateStation("Central Station", "Red Line");
	}
}