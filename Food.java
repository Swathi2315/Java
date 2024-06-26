public class Food {
    public static void main(String args[]) {
        String dishes[] = {"Pizza", "Sushi", "Burger"};
        int prices[] = {12, 18, 10};
        long orderNumbers[] = {123456789012345L, 987654321098765L, 246801357924680L};
        char types[] = {'Italian', 'Japanese', 'American'};

        System.out.print("Dishes are: ");
        for (int i = 0; i < dishes.length; i++) {
            System.out.print(dishes[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Prices are: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Order numbers are: ");
        for (int i = 0; i < orderNumbers.length; i++) {
            System.out.print(orderNumbers[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Types are: ");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + " ");
        }
    }
}
