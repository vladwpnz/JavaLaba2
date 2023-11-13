package JavaLab2;

class DVD extends Item {
    private int duration;

    public DVD(String title, String uniqueID, int duration) {
        super(title, uniqueID);
        this.duration = duration;
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
