public class JioRunner {
    public static void main(String[] args) {
	    Jio.recharge("9876543210");
        Jio.recharge("9876543210", 199);
        Jio.checkBalance("9876543210");
        Jio.checkBalance("9876543210", "data");
        Jio.activatePlan("PLAN999");
        Jio.activatePlan("PLAN999", "9876543210");
        Jio.raiseComplaint("9876543210");
        Jio.raiseComplaint("9876543210", "network issue");
	}
}