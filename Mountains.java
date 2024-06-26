public class Mountains {
    public static void main(String args[]) {
        String names[] = {"Everest", "K2", "Kangchenjunga"};
        int heights[] = {8848, 8611, 8586}; 
        long prominence[] = {8848L, 4017L, 3922L}; 
        char ranges[] = {'Himalayas', 'Karakoram', 'Himalayas'}; 

        System.out.print("Mountains are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Heights are: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Prominence are: ");
        for (int i = 0; i < prominence.length; i++) {
            System.out.print(prominence[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Ranges are: ");
        for (int i = 0; i < ranges.length; i++) {
            System.out.print(ranges[i] + " ");
        }
    }
}
