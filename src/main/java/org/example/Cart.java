package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Object> objectModel = new ArrayList<>();

    public void addProduct(Product product) {
        objectModel.add(product);
    }

    public List<Object> getObjectModel() {
        return objectModel;
    }

    public boolean isEmpty() {
        return objectModel.isEmpty();
    }
}
