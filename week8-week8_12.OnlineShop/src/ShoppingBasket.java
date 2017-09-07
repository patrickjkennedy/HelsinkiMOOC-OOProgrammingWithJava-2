
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pkennedy
 */
public class ShoppingBasket {

    private final Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            Purchase p = new Purchase(product, 1, price);
            this.basket.put(product, p);
        }

    }

    public int price() {
        int basketPrice = 0;
        for (Purchase p : this.basket.values()) {
            basketPrice += p.price();
        }
        return basketPrice;
    }

    public void print() {
        for (Purchase p : this.basket.values()) {
            System.out.println(p);
        }
    }
}
