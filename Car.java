public class Car {
    public static void main(String args[]) {
        String brands[] = {"Toyota", "Ford", "Honda"};
        int prices[] = {30000, 25000, 27000};
        long sales[] = {1000000L, 900000L, 950000L};
        char categories[] = {'Cat-A', 'Cat-S', 'Cat-N'};

        System.out.print("Brands are: ");
        for (int i = 0; i < brands.length; i++) {
            System.out.print(brands[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Prices are: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Sales are: ");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(sales[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Categories are: ");
        for (int i = 0; i < categories.length; i++) {
            System.out.print(categories[i] + " ");
        }
    }
}
