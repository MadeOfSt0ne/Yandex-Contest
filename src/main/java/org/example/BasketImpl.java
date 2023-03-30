package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

    Map<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int prevQuantity = basket.getOrDefault(product, 0);
        basket.put(product, prevQuantity + quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basket.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}
