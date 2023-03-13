package com.example.ermasofttest;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Car implements Comparable<Car> {
    private Manufacturer manufacturer;
    private Model model;
    private int price;
    private HashMap<String, Integer> details = new HashMap<>();

    public Car(Model model, HashMap<String, Integer> details) {
        this.model = model;
        this.manufacturer = model.getManufacturer();
        this.details = details;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : details.entrySet()) {
            sum += entry.getValue();
        }
        return model.getPrice() + sum;
    }

    private void setPrice(int price) {
        this.price = price;
    }
    public Model getModel() {return model;}
    public void setModel(Model model) {this.model = model;}

    public HashMap<String, Integer> getDetails() {
        return details;
    }

    public HashSet<String> getStringDetails() {
        HashMap<String, Integer> details = getDetails();
        HashSet<String> strings = new HashSet<>();
        for (Map.Entry<String, Integer> entry : details.entrySet()) {
            strings.add(entry.getKey());
        }
        return strings;
    }

    public void setDetails(HashMap<String, Integer> details) {
        this.details = details;
    }

    @Override
    public int compareTo(Car car) {
        return this.price - car.price;
    }

}
