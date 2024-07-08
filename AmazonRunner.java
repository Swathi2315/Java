public class AmazonRunner {
    public static void main(String[] args) {
        Amazon.search("laptop");
        Amazon.search("laptop", "electronics");

        
        Amazon.addToCart("12345");
        Amazon.addToCart("12345", 2);
       
        
        Amazon.checkout(50);
        Amazon.checkout(50, "PROMO20");
      

        Amazon.rateProduct("12345", 5);
        Amazon.rateProduct("12345", 4, "Great product!");
    }
}
