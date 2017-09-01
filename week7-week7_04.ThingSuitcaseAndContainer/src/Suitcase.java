
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
public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {

        int currentWeight = this.currentWeight();

        int totalWeight = currentWeight + thing.getWeight();

        if (totalWeight <= maxWeight) {
            this.things.add(thing);
        } 
    }

    public String toString() {
        int currentThings = this.things.size();
        int currentWeight = this.currentWeight();
        
        switch (currentThings) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return currentThings + " thing (" + currentWeight + " kg)";
            default:
                return currentThings + " things (" + currentWeight + " kg)";
        }
    }

    public int currentWeight() {
        int currentWeight = 0;

        for (Thing i : this.things) {
            currentWeight += i.getWeight();
        }
        return currentWeight;
    }
}
