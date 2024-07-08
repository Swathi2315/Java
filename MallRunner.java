public class MallRunner {
    public static void main(String[] args) {
	    Mall.findStore("H&M");
        Mall.findStore("H&M", "1st Floor");
        Mall.checkEvents("2024-12-25");
        Mall.checkEvents("2024-12-25", "Christmas");
        Mall.getParkingInfo("Section A");
        Mall.getParkingInfo("Section A", "10 AM");
        Mall.reserveTable("The Italian Place");
        Mall.reserveTable("The Italian Place", "7 PM");
	}
}