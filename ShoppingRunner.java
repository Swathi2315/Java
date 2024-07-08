public class ShoppingRunner {
    public static void main(String[] args) {
	    Shopping.browseCategory("Clothing");
        Shopping.browseCategory("Clothing", "Men");
        Shopping.addToWishlist("5555");
        Shopping.addToWishlist("5555", 3);
        Shopping.applyCoupon("SAVE20");
        Shopping.applyCoupon("SAVE20", 100);
        Shopping.checkout("CART123");
        Shopping.checkout("CART123", "Credit Card");
	}
}