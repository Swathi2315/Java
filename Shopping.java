public class Shopping {
   
    public static void browseCategory(String category) {
        System.out.println("Browsing category: " + category);
    }

    public static void browseCategory(String category, String subcategory) {
        System.out.println("Browsing category: " + category + " with subcategory: " + subcategory);
    }

    public static void addToWishlist(String productId) {
        System.out.println("Adding product with ID: " + productId + " to wishlist.");
    }

    public static void addToWishlist(String productId, int quantity) {
        System.out.println("Adding " + quantity + " units of product with ID: " + productId + " to wishlist.");
    }

    public static void applyCoupon(String couponCode) {
        System.out.println("Applying coupon code: " + couponCode);
    }

    public static void applyCoupon(String couponCode, double minPurchase) {
        System.out.println("Applying coupon code: " + couponCode + " with minimum purchase: " + minPurchase);
    }

    public static void checkout(String cartId) {
        System.out.println("Checking out cart with ID: " + cartId);
    }

    public static void checkout(String cartId, String paymentMethod) {
        System.out.println("Checking out cart with ID: " + cartId + " using payment method: " + paymentMethod);
    }
}
