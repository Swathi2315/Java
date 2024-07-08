public class NetflixRunner {
    public static void main(String[] args) {
		Netflix.search("Stranger Things");
        Netflix.search("Stranger Things", "Sci-Fi");
        Netflix.addToWatchlist("67890");
        Netflix.addToWatchlist("67890", 3);
        Netflix.play("67890");
        Netflix.play("67890", 2);
        Netflix.rateShow("67890", 4);
        Netflix.rateShow("67890", 4, "Exciting series!");
	}
}