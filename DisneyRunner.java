public class DisneyRunner {
    public static void main(String[] args) {
	    Disney.search("Frozen");
        Disney.search("Frozen", "Animation");
        Disney.addToFavorites("112233");
        Disney.addToFavorites("112233", 2013);
        Disney.play("112233");
        Disney.play("112233", 1080);
        Disney.rateMovie("112233", 5);
        Disney.rateMovie("112233", 5, "Magical!");
	}
}