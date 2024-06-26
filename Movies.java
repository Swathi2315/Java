public class Movies {
    public static void main(String args[]) {
        String titles[] = {"Wednesday", "The Matrix", "Interstellar"};
        int durations[] = {148, 136, 169};
        long earnings[] = {829895144L, 463517383L, 677471339L}; 
        char ratings[] = {'A', 'G', 'PG-13'}; 

        System.out.print("Movie titles are: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Durations are: ");
        for (int i = 0; i < durations.length; i++) {
            System.out.print(durations[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Earnings are: ");
        for (int i = 0; i < earnings.length; i++) {
            System.out.print(earnings[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Ratings are: ");
        for (int i = 0; i < ratings.length; i++) {
            System.out.print(ratings[i] + " ");
        }
    }
}
