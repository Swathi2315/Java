public class City {
    public static void main(String args[]) {
        String cities[] = {"New York", "Los Angeles", "Chicago"};
        int populations[] = {8419000, 3980000, 2716000};
        long areas[] = {783L, 503L, 589L};
        char grades[] = {'A', 'B', 'A'};

        System.out.print("Cities are: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Populations are: ");
        for (int i = 0; i < populations.length; i++) {
            System.out.print(populations[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Areas are: ");
        for (int i = 0; i < areas.length; i++) {
            System.out.print(areas[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Grades are: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }
}
