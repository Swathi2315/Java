public class Planets {
    public static void main(String args[]) {
        String names[] = {"Earth", "Mars", "Jupiter"};
        int distances[] = {0, 225, 778}; 
        long diameters[] = {12742L, 6792L, 139820L}; 
        char types[] = {'Terrestrial', 'Terrestrial', 'Gas Giant'};

        System.out.print("Planets are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Distances are: ");
        for (int i = 0; i < distances.length; i++) {
            System.out.print(distances[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Diameters are: ");
        for (int i = 0; i < diameters.length; i++) {
            System.out.print(diameters[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Types are: ");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + " ");
        }
    }
}
