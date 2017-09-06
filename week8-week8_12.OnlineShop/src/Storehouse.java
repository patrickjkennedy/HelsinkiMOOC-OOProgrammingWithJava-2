
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
public class Storehouse {
    private final Map<String, Integer> prices;
    private final Map<String, Integer> stock;
    
    public Storehouse(){
        prices = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();

    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        if(prices.containsKey(product)){
            Integer price = this.prices.get(product);
            return price;
        } else {
            return -99;
        } 
    }
}
