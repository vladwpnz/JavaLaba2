package JavaLab2;

import java.util.ArrayList;
import java.util.List;

class Patron {
    final private String name;
    final private List<Item> borrowedItems;

    public Patron(String name) {
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrow(Item item) {
        borrowedItems.add(item);
        item.borrowItem();
    }

    public void returnItem(Item item) {
        borrowedItems.remove(item);
        item.returnItem();
    }
}

