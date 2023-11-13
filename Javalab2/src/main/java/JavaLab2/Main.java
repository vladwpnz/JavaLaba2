package JavaLab2;

abstract class Item {
    private final String title;
    private boolean isBorrowed;

    public Item(String title, String ignoredUniqueID) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return !isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    abstract void borrowItem();

    abstract void returnItem();
}
