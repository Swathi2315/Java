public class University {
    public static void main(String args[]) {
        String universities[] = {"Sahyadri", "VTU", "ALVAS"};
        int established[] = {2007, 1902, 1970};
        long endowments[] = {41000000000L, 29000000000L, 16000000000L};
        char regions[] = {'Mangalore', 'Belgaum', 'Moodbidri'};

        System.out.print("Universities are: ");
        for (int i = 0; i < universities.length; i++) {
            System.out.print(universities[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Established years are: ");
        for (int i = 0; i < established.length; i++) {
            System.out.print(established[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Endowments are: ");
        for (int i = 0; i < endowments.length; i++) {
            System.out.print(endowments[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Regions are: ");
        for (int i = 0; i < regions.length; i++) {
            System.out.print(regions[i] + " ");
        }
    }
}
