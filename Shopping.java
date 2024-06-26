public class Shopping {
    public static void main(String args[]) {
        String items[] = {"Shirt", "Jeans", "Shoes"};
        int prices[] = {25, 50, 80};
        long orderNumbers[] = {1234567890123L, 9876543210987L, 2468013579246L};
        char categories[] = {'Clothing', 'Accessories', 'Footwear'};

        System.out.print("Items are: ");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
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

        System.out.print("Categories are: ");
        for (int i = 0; i < categories.length; i++) {
            System.out.print(categories[i] + " ");
        }
    }
}
