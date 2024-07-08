public class BrowserRunner {
    public static void main(String[] args) {
	Browser.openURL("http://example.com");
        Browser.openURL("http://example.com", "incognito");
        Browser.search("Java tutorials");
        Browser.search("Java tutorials", "videos");
        Browser.bookmarkPage("http://example.com");
        Browser.bookmarkPage("http://example.com", "Example Site");
        Browser.clearHistory();
        Browser.clearHistory("last hour");
	}
}