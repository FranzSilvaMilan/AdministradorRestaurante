package model;

public class AlcoholicDrinks {

    private String name;
    private double price;
    private int quantity;
    private int units;

    public AlcoholicDrinks(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
        this.units = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
