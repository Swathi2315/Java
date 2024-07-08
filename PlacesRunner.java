public class PlacesRunner {
    public static void main(String[] args) {
	Places.searchPlace("Eiffel Tower");
        Places.searchPlace("Eiffel Tower", "landmark");
        Places.addToFavorites("4444");
        Places.addToFavorites("4444", "tourist attraction");
        Places.reviewPlace("4444", 5);
        Places.reviewPlace("4444", 5, "Must visit!");
        Places.getDirections("4444");
        Places.getDirections("4444", "walking");
	}
}