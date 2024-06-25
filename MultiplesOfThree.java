public class MultiplesOfThree {
    public static void main(String[] args) {
        int[] array = {1, 27, 33, 44, 56, 62, 77, 81, 19, 10, 11, 22, 93, 14, 15};

        System.out.print("Multiples of 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
