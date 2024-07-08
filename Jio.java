public class Jio {
   
    public static void recharge(String number) {
        System.out.println("Recharging number: " + number);
    }

    public static void recharge(String number, double amount) {
        System.out.println("Recharging number: " + number + " with amount: " + amount);
    }

    public static void checkBalance(String number) {
        System.out.println("Checking balance for number: " + number);
    }

    public static void checkBalance(String number, String type) {
        System.out.println("Checking balance for number: " + number + " for type: " + type);
    }

    public static void activatePlan(String planId) {
        System.out.println("Activating plan with ID: " + planId);
    }

    public static void activatePlan(String planId, String number) {
        System.out.println("Activating plan with ID: " + planId + " for number: " + number);
    }

    public static void raiseComplaint(String number) {
        System.out.println("Raising complaint for number: " + number);
    }

    public static void raiseComplaint(String number, String issue) {
        System.out.println("Raising complaint for number: " + number + " with issue: " + issue);
    }
}
