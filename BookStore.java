public class BookStore {
    public static void main(String args[]) {
        String books[] = {"Wednesday", "Moby Dick", "Hamlet"};
        int copiesSold[] = {30000000, 15000000, 20000000};
        long ISBNs[] = {9780451524935L, 9781503280786L, 9781980625026L};
        char categories[] = {'Comics', 'Thriller', 'Novel'};

        System.out.print("Books are: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Copies sold are: ");
        for (int i = 0; i < copiesSold.length; i++) {
            System.out.print(copiesSold[i] + " ");
        }
        System.out.println("\n");

        System.out.print("ISBNs are: ");
        for (int i = 0; i < ISBNs.length; i++) {
            System.out.print(ISBNs[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Categories are: ");
        for (int i = 0; i < categories.length; i++) {
            System.out.print(categories[i] + " ");
        }
    }
}
