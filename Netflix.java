public class Netflix {
   
    public static void search(String title) {
        System.out.println("Searching for title: " + title);
    }

    public static void search(String title, String genre) {
        System.out.println("Searching for title: " + title + " in genre: " + genre);
    }

    public static void addToWatchlist(String showId) {
        System.out.println("Adding show with ID: " + showId + " to watchlist.");
    }

    public static void addToWatchlist(String showId, int season) {
        System.out.println("Adding season " + season + " of show with ID: " + showId + " to watchlist.");
    }

    public static void play(String showId) {
        System.out.println("Playing show with ID: " + showId);
    }

    public static void play(String showId, int episode) {
        System.out.println("Playing episode " + episode + " of show with ID: " + showId);
    }

    public static void rateShow(String showId, int rating) {
        System.out.println("Rating show with ID: " + showId + " with rating: " + rating);
    }

    public static void rateShow(String showId, int rating, String review) {
        System.out.println("Rating show with ID: " + showId + " with rating: " + rating + " and review: " + review);
    }
}
