import java.util.*;

public class Library {
    private InventoryManager inventory = new InventoryManager();
    private LendingService lending = new LendingService();
    private Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getBorrowedBooks().toString(), patron);
    }

    public Patron getPatron(String id) {
        return patrons.get(id);
    }

    public InventoryManager getInventory() {
        return inventory;
    }

    public LendingService getLendingService() {
        return lending;
    }
}