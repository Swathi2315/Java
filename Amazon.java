public class Amazon {
   
    public static void search(String keyword) {
        System.out.println("Searching for products with keyword: " + keyword);
    }

    public static void search(String keyword, String category) {
        System.out.println("Searching for products with keyword: " + keyword + " in category: " + category);
    }
	
   
    public static void addToCart(String productId) {
        System.out.println("Adding product with ID: " + productId + " to cart.");
    }

    public static void addToCart(String productId, int quantity) {
        System.out.println("Adding " + quantity + " units of product with ID: " + productId + " to cart.");
    }

    
    public static void checkout(int cart) {
        System.out.println("Checking out cart with total: " + cart);
    }

    public static void checkout(int cart, String promoCode) {
        System.out.println("Checking out cart with total: " + cart + " using promo code: " + promoCode);
    }

    
    public static void rateProduct(String productId, int rating) {
        System.out.println("Rating product with ID: " + productId + " with rating: " + rating);
    }

    public static void rateProduct(String productId, int rating, String review) {
        System.out.println("Rating product with ID: " + productId + " with rating: " + rating + " and review: " + review);
    }
}
