public class Rivers {
    public static void main(String args[]) {
        String names[] = {"Nile", "Amazon", "Yangtze"};
        int lengths[] = {6650, 6400, 6300}; 
        long discharges[] = {2830L, 209000L, 31900L}; 
        char continents[] = {'Africa', 'South America', 'Africa'}; 

        System.out.print("Rivers are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Lengths are: ");
        for (int i = 0; i < lengths.length; i++) {
            System.out.print(lengths[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Discharges are: ");
        for (int i = 0; i < discharges.length; i++) {
            System.out.print(discharges[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Continents are: ");
        for (int i = 0; i < continents.length; i++) {
            System.out.print(continents[i] + " ");
        }
    }
}
