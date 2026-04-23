public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "John", "111", 2020);
        Book b2 = new Book("OOP Concepts", "Smith", "222", 2021);

        library.getInventory().addBook(b1);
        library.getInventory().addBook(b2);

        Patron p1 = new Patron("P1", "Swarupa");
        library.addPatron(p1);

        library.getLendingService().checkoutBook(b1, p1);
        library.getLendingService().returnBook(b1, p1);
    }
}