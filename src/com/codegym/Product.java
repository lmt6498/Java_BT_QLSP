package com.codegym;

public class Product {
    private int ID;
    private String Name;
    private float AveragePrice;

    public Product() {

    }

    public Product(int ID, String name, float averagePrice) {
        this.ID = ID;
        Name = name;
        AveragePrice = averagePrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(float averagePrice) {
        AveragePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", AveragePrice=" + AveragePrice +
                '}';
    }
}
