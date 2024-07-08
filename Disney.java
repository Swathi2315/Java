public class Disney {
   
    public static void search(String movie) {
        System.out.println("Searching for movie: " + movie);
    }

    public static void search(String movie, String genre) {
        System.out.println("Searching for movie: " + movie + " in genre: " + genre);
    }

    public static void addToFavorites(String movieId) {
        System.out.println("Adding movie with ID: " + movieId + " to favorites.");
    }

    public static void addToFavorites(String movieId, int year) {
        System.out.println("Adding movie with ID: " + movieId + " released in year: " + year + " to favorites.");
    }

    public static void play(String movieId) {
        System.out.println("Playing movie with ID: " + movieId);
    }

    public static void play(String movieId, int quality) {
        System.out.println("Playing movie with ID: " + movieId + " in quality: " + quality + "p");
    }

    public static void rateMovie(String movieId, int rating) {
        System.out.println("Rating movie with ID: " + movieId + " with rating: " + rating);
    }

    public static void rateMovie(String movieId, int rating, String review) {
        System.out.println("Rating movie with ID: " + movieId + " with rating: " + rating + " and review: " + review);
    }
}
