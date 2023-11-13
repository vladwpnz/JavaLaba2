package JavaLab2;

public class Tests {
    public static void main(String[] args) {
        Library library = new Library();

        Item book1 = new Book("Book1", "B001", "Author1");
        Item dvd1 = new DVD("DVD1", "D001", 120);

        library.add(book1);
        library.add(dvd1);

        Patron patron1 = new Patron("Patron1");
        Patron patron2 = new Patron("Patron2");

        library.registerPatron(patron1);
        library.registerPatron(patron2);

        System.out.println("\nAvailable Items:");
        library.listAvailable();

        library.lendItem(patron1, book1);

        System.out.println("\nBorrowed Items:");
        library.listBorrowed();

        library.lendItem(patron2, book1);

        library.returnItem(patron1, book1);

        System.out.println("\nAvailable Items after return:");
        library.listAvailable();
    }
}
