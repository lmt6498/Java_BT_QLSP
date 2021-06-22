package com.codegym;

import java.util.Comparator;

public class ProductComporator implements Comparator<ManageProduct> {

    @Override
    public int compare(ManageProduct o1, ManageProduct o2) {
        if(o1.getAveragePrice()>o2.getAveragePrice()) {
            return 1;
        }else return -1;
    }
}
