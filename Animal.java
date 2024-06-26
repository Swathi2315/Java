public class Animal {
    public static void main(String args[]) {
        String animals[] = {"Lion", "Deer", "Elephant"};
        int ages[] = {10, 8, 15};
        long weights[] = {190L, 220L, 5400L};
        char habitats[] = {'Savanna', 'Grassland', 'Forest'};

        System.out.print("Animals are: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Ages are: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Weights are: ");
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Habitats are: ");
        for (int i = 0; i < habitats.length; i++) {
            System.out.print(habitats[i] + " ");
        }
    }
}
