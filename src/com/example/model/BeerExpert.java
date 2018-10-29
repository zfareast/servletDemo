package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/29.
 */
public class BeerExpert {
    public List getBrands(String color) {
        List brands = new ArrayList();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return(brands);
    }
}
