public class LendingService {

    public void checkoutBook(Book book, Patron patron) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            patron.borrowBook(book);
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(Book book, Patron patron) {
        book.setAvailable(true);
        patron.returnBook(book);
        System.out.println("Book returned successfully");
    }
}