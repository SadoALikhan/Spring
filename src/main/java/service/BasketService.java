package service;

import model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class BasketService {
    private final Basket basket = new Basket();


    public void add(Set<Integer> ids) {
        ids.forEach(basket::addProduct);
    }


    public Set<Integer> get() {
        return basket.getProducts();
    }
}
