public class Trees {
    public static void main(String args[]) {
        String names[] = {"Oak", "Pine", "Maple"};
        int ages[] = {100, 150, 80};
        long heights[] = {20L, 30L, 25L}; 
        char types[] = {'Deciduous', 'Coniferous', 'Deciduous'};

        System.out.print("Trees are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Ages are: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Heights are: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Types are: ");
        for (int i = 0; i < types.length; i++) {
            System.out.print(types[i] + " ");
        }
    }
}


