public class Countries {
    public static void main(String args[]) {
        String names[] = {"USA", "China", "Seoul"};
        int populations[] = {331000000, 1440000000, 1380000000};
        long areas[] = {9834000L, 9597000L, 3287000L}; 
        char continents[] = {'North America', 'Asia', 'South Korea'}; 

        System.out.print("Countries are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
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

        System.out.print("Continents are: ");
        for (int i = 0; i < continents.length; i++) {
            System.out.print(continents[i] + " ");
        }
    }
}
