package chjTest.map.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> map = new HashMap<>();

    public void add(Product product, int quantity) {
        if (quantity > 0) {
            /*for (Product p : map.keySet()) {
                if (p.equals(product)) {
                    map.put(p, map.get(p) + quantity);

                    return;
                }
            }

            map.put(product, quantity);*/

            int existingQuantity = map.getOrDefault(product, 0);
            map.put(product, existingQuantity + quantity);
        }
    }

    public void minus(Product product, int quantity) {
        /*for (Product p : map.keySet()) {
            if (p.equals(product)) {
                if (map.get(p) > quantity) {
                    map.put(p, map.get(p) - quantity);
                } else {
                    map.remove(p);
                }

                return;
            }
        }*/

        int existingQuantity = map.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0) {
            map.remove(product);
        } else {
            map.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : map.keySet()) {
            System.out.println("상품: " + product + ", 수량: " + map.get(product));
        }
    }
}
