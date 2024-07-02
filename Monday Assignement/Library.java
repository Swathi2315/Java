public class Library {
    

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String book) {
        books.remove(book);
        System.out.println("Book removed: " + book);
    }

    public void findBook(String book) {
        if (books.contains(book)) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void issueBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(String book) {
        books.add(book);
        System.out.println("Book returned: " + book);
    }
}