public class CountEvenOdd {
    public static void main(String[] args) {
        int[] array = {11, 32, 67, 44, 53, 62, 27, 98, 6, 10};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}
