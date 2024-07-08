public class Metro {
   
    public static void checkSchedule(String line) {
        System.out.println("Checking schedule for line: " + line);
    }

    public static void checkSchedule(String line, String station) {
        System.out.println("Checking schedule for line: " + line + " at station: " + station);
    }

    public static void buyTicket(String startStation, String endStation) {
        System.out.println("Buying ticket from " + startStation + " to " + endStation);
    }

    public static void buyTicket(String startStation, String endStation, int quantity) {
        System.out.println("Buying " + quantity + " tickets from " + startStation + " to " + endStation);
    }

    public static void checkFare(String startStation, String endStation) {
        System.out.println("Checking fare from " + startStation + " to " + endStation);
    }

    public static void checkFare(String startStation, String endStation, String fareType) {
        System.out.println("Checking fare from " + startStation + " to " + endStation + " for fare type: " + fareType);
    }

    public static void locateStation(String stationName) {
        System.out.println("Locating station: " + stationName);
    }

    public static void locateStation(String stationName, String line) {
        System.out.println("Locating station: " + stationName + " on line: " + line);
    }
}
