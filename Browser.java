public class Browser {
   
    public static void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    public static void openURL(String url, String mode) {
        System.out.println("Opening URL: " + url + " in mode: " + mode);
    }

    public static void search(String query) {
        System.out.println("Searching for: " + query);
    }

    public static void search(String query, String filter) {
        System.out.println("Searching for: " + query + " with filter: " + filter);
    }

    public static void bookmarkPage(String url) {
        System.out.println("Bookmarking page with URL: " + url);
    }

    public static void bookmarkPage(String url, String name) {
        System.out.println("Bookmarking page with URL: " + url + " with name: " + name);
    }

    public static void clearHistory() {
        System.out.println("Clearing browser history.");
    }

    public static void clearHistory(String timeframe) {
        System.out.println("Clearing browser history for timeframe: " + timeframe);
    }
}
