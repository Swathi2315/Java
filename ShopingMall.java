public class ShopingMall {

    static  String shopName = "Forum";
   static int shopID= 12345;
    static String itemName = "Kitchen Sets";
   static double shop_timings= 9.0 ;
    static int price_starts_from = 200;

     
   

    public static void getshopName() {
        if (shopName != null) {
            System.out.println("Shop Name: " + shopName);
        } else {
            System.out.println("Shop name not available.");
        }
    }

    public static void getShopID() {
        if (shopID > 0) {
            System.out.println("Shop ID: " + shopID);
        } else {
            System.out.println("Invalid Shop ID.");
        }
    }

    public static void getItemName() {
        if (itemName!= null) {
            System.out.println("Item Name: " + itemName);
        } else {
            System.out.println("Item name not available.");
        }
    }

    public static  void getshop_timings() {
        if (shop_timings >= 9.0 &&shop_timings <= 11.0) {
            System.out.println("shop_timings: " + shop_timings);
        } else {
            System.out.println("Invalid Time.");
        }
    }

    public static void getprice_starts_from() {
        if (price_starts_from < 2000) {
            System.out.println("price_starts_from: " + price_starts_from);
        } else {
            System.out.println("Invalid Price.");
        }
    }

}