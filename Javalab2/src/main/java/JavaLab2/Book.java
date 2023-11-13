package JavaLab2;

class Book extends Item {
    private String author;

    public Book(String title, String uniqueID, String author) {
        super(title, uniqueID);
        this.author = author;
    }

    @Override
    public void borrowItem() {
        setBorrowed(true);
    }

    @Override
    public void returnItem() {
        setBorrowed(false);
    }
}