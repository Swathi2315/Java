public class Students {
    public static void main(String args[]) {
        String students[] = {"Rajii", "Swathi", "Usha"};
        int scores[] = {85, 90, 78};
        long phnos[] = {9876543210L, 9123456789L, 9988776655L};
        char sections[] = {'A', 'B', 'C'};

        System.out.print("Students are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Scores are: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Phone numbers are: ");
        for (int i = 0; i < phnos.length; i++) {
            System.out.print(phnos[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Sections are: ");
        for (int i = 0; i < sections.length; i++) {
            System.out.print(sections[i] + " ");
        }
    }
}
