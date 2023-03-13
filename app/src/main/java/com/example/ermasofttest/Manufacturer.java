package com.example.ermasofttest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manufacturer {
    Enum<ManufacturerName> name;
    HashMap<String, Model> models;

    public Manufacturer(Enum<ManufacturerName> name) {
        this.name = name;
    }

    public HashMap<String, Model> getModels() {
        return models;
    }

    public void setModels(HashMap<String, Model> models) {
        this.models = models;
    }

    public Enum<ManufacturerName> getName() {return name;}

    public void setName(Enum<ManufacturerName> name) {
        this.name = name;
    }
}
