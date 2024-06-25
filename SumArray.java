public class SumArray {
    public static void main(String[] args) {
        int[] array = {11, 87, 56, 14, 25};
        
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = sumArrayElements(array);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
