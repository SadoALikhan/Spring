package model;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Basket {

    private Set<Integer> products = new HashSet<>();

    public Set<Integer> getProducts() {
        return products;
    }

    public void addProduct(Integer id) {
        products.add(id);

    }

    @Override
    public String toString() {
        return "Basket{" +
                "productID=" + products +
                '}';
    }
}
