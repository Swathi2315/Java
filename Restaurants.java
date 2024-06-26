public class Restaurants {
    public static void main(String args[]) {
        String names[] = {"The ocean pearl", "Krishna", "Udupi"};
        int ratings[] = {3, 3, 3}; 
        long revenues[] = {25000000L, 15000000L, 20000000L}; 
        char types[] = {'Italian', 'Indian', 'Indian'}; 

        System.out.print("Restaurants are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Ratings are: ");
        for (int i = 0; i < ratings.length; i++) {
            System.out.print(ratings[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Revenues are: ");
        for (int i = 0; i < revenues.length; i++) {
            System.out.print(revenues[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Types are: ");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + " ");
        }
    }
}
