package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;

public class ManageProduct extends Product implements IProduct{
    ArrayList<ManageProduct> products = new ArrayList<>();

    public ManageProduct() {

    }


    public ManageProduct(int ID, String name, float averagePrice) {
        super(ID, name, averagePrice);
    }

    public void addProduct(int ID, String name, float averagePrice) {
        products.add(new ManageProduct(ID, name, averagePrice));
    }

    public void deleteProduct(int ID) {
        ManageProduct target = null;
        for (ManageProduct s : products) {
            if (s.getID() == ID) {
                target = s;
            }
        }
        products.remove(target);
    }

    public void updateProduct(int ID, String newName, float newAveragePrice) {
        for (ManageProduct s : products) {
            if (s.getID() == ID) {
                s.setName(newName);
                s.setAveragePrice(newAveragePrice);
            }
        }
    }

    public void searchProduct(String name) {
        for (ManageProduct s : products) {
            if (s.getName().equals(name)) {
                System.out.println(s);
            }
        }
    }
//    public void sortBook(){
//
//    }

    @Override
    public void Display() {
        for (ManageProduct s : products) {
            System.out.println(s);
        }
    }

    @Override
    public void Sort() {
        Comparator productComporator = new ProductComporator();
        products.sort(productComporator);
    }
}
