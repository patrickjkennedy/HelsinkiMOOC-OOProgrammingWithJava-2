
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Box implements ToBeStored{
    private final ArrayList<ToBeStored> Things;
    private final double maxWeight;
    
    public Box(double maxWeight){
        this.Things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public double weight(){
        double weight = 0.0;
        for (ToBeStored Thing: Things){
            weight += Thing.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored Thing){
        if(weight() + Thing.weight() < this.maxWeight){
            Things.add(Thing);
        }
    }
    
    public String toString(){
        return "Box: " + Things.size() + " things, total weight " + weight() + " kg";
    }
    
}
