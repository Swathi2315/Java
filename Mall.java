public class Mall {
   
    public static void findStore(String storeName) {
        System.out.println("Finding store: " + storeName);
    }

    public static void findStore(String storeName, String floor) {
        System.out.println("Finding store: " + storeName + " on floor: " + floor);
    }

    public static void checkEvents(String date) {
        System.out.println("Checking events on date: " + date);
    }

    public static void checkEvents(String date, String type) {
        System.out.println("Checking " + type + " events on date: " + date);
    }

    public static void getParkingInfo(String section) {
        System.out.println("Getting parking info for section: " + section);
    }

    public static void getParkingInfo(String section, String time) {
        System.out.println("Getting parking info for section: " + section + " at time: " + time);
    }

    public static void reserveTable(String restaurant) {
        System.out.println("Reserving table at restaurant: " + restaurant);
    }

    public static void reserveTable(String restaurant, String time) {
        System.out.println("Reserving table at restaurant: " + restaurant + " for time: " + time);
    }
}
