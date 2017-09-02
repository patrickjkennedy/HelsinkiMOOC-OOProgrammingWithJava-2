
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
}
    
    public void addSuitcase(Suitcase suitcase){
        
        int currentWeight = this.totalWeight();

        int totalWeight = currentWeight + suitcase.totalWeight();

        if (totalWeight <= this.maxWeight) {
            this.container.add(suitcase);
        }
        
    }
    
    public String toString(){
        return this.container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase i : this.container) {
            totalWeight += i.totalWeight();
        }
        return totalWeight;
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }
    
}
