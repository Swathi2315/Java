public class Places {
   
    public static void searchPlace(String placeName) {
        System.out.println("Searching for place: " + placeName);
    }

    public static void searchPlace(String placeName, String type) {
        System.out.println("Searching for place: " + placeName + " of type: " + type);
    }

    public static void addToFavorites(String placeId) {
        System.out.println("Adding place with ID: " + placeId + " to favorites.");
    }

    public static void addToFavorites(String placeId, String category) {
        System.out.println("Adding place with ID: " + placeId + " to favorites in category: " + category);
    }

    public static void reviewPlace(String placeId, int rating) {
        System.out.println("Reviewing place with ID: " + placeId + " with rating: " + rating);
    }

    public static void reviewPlace(String placeId, int rating, String review) {
        System.out.println("Reviewing place with ID: " + placeId + " with rating: " + rating + " and review: " + review);
    }

    public static void getDirections(String placeId) {
        System.out.println("Getting directions to place with ID: " + placeId);
    }

    public static void getDirections(String placeId, String mode) {
        System.out.println("Getting directions to place with ID: " + placeId + " using mode: " + mode);
    }
}
