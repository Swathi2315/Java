public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Harry Potter and the Philosopher's Stone");
        library.addBook("To Kill a Mockingbird");
        library.addBook("1984");

  
        library.removeBook("To Kill a Mockingbird");

        
        library.findBook("Harry Potter and the Philosopher's Stone");
        library.findBook("To Kill a Mockingbird");

       
        library.issueBook("1984");
        library.findBook("1984");

        
        library.returnBook("1984");
        library.findBook("1984");
    }
}
