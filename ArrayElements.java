public class ArrayElements {
    public static void main(String[] args) {
        
        int[] num = {1, 2, 3, 4};
        String[] names = {"Swathi", "Rajii", "Ushaa", "Praniti", "sahana"};
        char[]  alpha= {'a', 'b', 'c', 'd', 'e'};
        short[] tens = {10, 20, 30, 40};
        byte[]   digit= {1, 2, 3, 4, 5};
        float[]  trees= {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] birds = {1.11, 2.22, 3.33, 4.44, 5.55};
        boolean[] booleanArray = {true, false, true, false, true, false};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};

        
       
   
        System.out.println("int" + " (length: " + num.length + "):");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n");
  

        System.out.println("string"+ " (length: " + names.length + "):");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");
    
        System.out.println("char"+ " (length: " + alpha.length + "):");
        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
        System.out.println("\n");
   
        System.out.println("short" + " (length: " + tens.length + "):");
        for (int i = 0; i < tens.length; i++) {
            System.out.print(tens[i] + " ");
        }
        System.out.println("\n");
    
        System.out.println("byte" + " (length: " + digit.length + "):");
        for (int i = 0; i < digit.length; i++) {
            System.out.print(digit[i] + " ");
        }
        System.out.println("\n");
    
        System.out.println("float" + " (length: " + trees.length + "):");
        for (int i = 0; i < trees.length; i++) {
            System.out.print(trees[i] + " ");
        }
        System.out.println("\n");
    

        System.out.println("double" + " (length: " + birds.length + "):");
        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i] + " ");
        }
        System.out.println("\n");
    

        System.out.println("boolean" + " (length: " + booleanArray.length + "):");
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.print(booleanArray[i] + " ");
        }
        System.out.println("\n");
   
        System.out.println("long "+ " (length: " + longArray.length + "):");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println("\n");
    
}
}
