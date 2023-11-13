package JavaLab2;

import java.util.ArrayList;
import java.util.List;

class Library implements IManageable {
    final List<Item> items;
    final private List<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
        System.out.println("Item removed: " + item.getTitle());
    }

    @Override
    public void listAvailable() {
        System.out.println("Available items:");
        for (Item item : items) {
            if (item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }

    @Override
    public void listBorrowed() {
        System.out.println("Borrowed items:");
        for (Patron patron : patrons) {
            for (Item item : patron.getBorrowedItems()) {
                System.out.println("Patron: " + patron.getName() + ", Item: " + item.getTitle());
            }
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron registered: " + patron.getName());
    }

    public void lendItem(Patron patron, Item item) {
        if (item.isBorrowed()) {
            patron.borrow(item);
            System.out.println("Item lent to patron: " + patron.getName() + ", Item: " + item.getTitle());
        } else {
            System.out.println("Item is already borrowed.");
        }
    }

    public void returnItem(Patron patron, Item item) {
        if (patron.getBorrowedItems().contains(item)) {
            patron.returnItem(item);
            System.out.println("Item returned by patron: " + patron.getName() + ", Item: " + item.getTitle());
        } else {
            System.out.println("Patron did not borrow this item.");
        }
    }
}
