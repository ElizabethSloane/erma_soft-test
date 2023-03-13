package com.example.ermasofttest;

import java.util.HashMap;
import java.util.HashSet;

public class Model {
    String name;
    Manufacturer manufacturer;

    int price;

    public Model(String name, Manufacturer manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }
    public Manufacturer getManufacturer() {return manufacturer;}

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
