package logic.entity;

/**
 items and their common fields and methods
 */
public abstract class Item {
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
