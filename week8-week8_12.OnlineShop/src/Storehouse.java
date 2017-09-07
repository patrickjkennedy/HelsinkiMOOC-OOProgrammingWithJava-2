
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

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            int price = this.prices.get(product);
            return price;
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (prices.containsKey(product)) {
            int stock = this.stock.get(product);
            return stock;
        } else {
            return 0;
        }
    }

    // You need to iterate over the hashmap, instead of using containsKey, 
    // to avoid nullpointer exception when product doesn't exist
    
    
    public boolean take(String product){
        for(String p : this.stock.keySet()){
            if(p.equals(product)){
                if(this.stock(p) > 0){
                    this.stock.put(p, this.stock(p) - 1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> result = new HashSet<String>();
        for(String p : this.stock.keySet()){
            result.add(p);
        }
        return result;
    }
}
