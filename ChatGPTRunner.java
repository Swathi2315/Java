public class ChatGPTRunner {
    public static void main(String[] args) {
	ChatGPT.askQuestion("What is the capital of France?");
        ChatGPT.askQuestion("What is the capital of France?", "Geography");
        ChatGPT.getResponse("1001");
        ChatGPT.getResponse("1001", 30);
        ChatGPT.rateResponse("2002", 5);
        ChatGPT.rateResponse("2002", 5, "Accurate answer!");
        ChatGPT.saveResponse("3003");
        ChatGPT.saveResponse("3003", "response.txt");
		}
}