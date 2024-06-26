public class Smartphone {
    public static void main(String args[]) {
        String models[] = {"iPhone", "Galaxy S", "Pixel"};
        int prices[] = {99999, 14799, 35599};
        long sales[] = {5000000L, 4000000L, 3000000L};
        char versions[] = {'13', '21', '6'};

        System.out.print("Models are: ");
        for (int i = 0; i < models.length; i++) {
            System.out.print(models[i] + " ");
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

        System.out.print("Versions are: ");
		for (int i = 0; i < versions.length; i++) {
            System.out.print(versions[i] + " ");
        }
        System.out.println("\n");
    }
}	
