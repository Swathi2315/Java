public class Vehicle {
    public static void main(String args[]) {
        String models[] = {"Toyota Camry", "Honda Civic", "Ford F-150"};
        int prices[] = {25000, 22000, 35000};
        long vinNumbers[] = {12345678901234567L, 98765432109876543L, 24680135792468013L};
        char types[] = {'Sedan', 'Coupe', 'Truck'}; 

        System.out.print("Vehicle models are: ");
        for (int i = 0; i < models.length; i++) {
            System.out.print(models[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Prices are: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println("\n");

        System.out.print("VIN numbers are: ");
        for (int i = 0; i < vinNumbers.length; i++) {
            System.out.print(vinNumbers[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Types are: ");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + " ");
        }
    }
}
