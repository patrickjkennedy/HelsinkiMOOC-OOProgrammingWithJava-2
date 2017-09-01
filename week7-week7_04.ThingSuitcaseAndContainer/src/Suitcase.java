
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

        int currentWeight = this.totalWeight();

        int totalWeight = currentWeight + thing.getWeight();

        if (totalWeight <= maxWeight) {
            this.things.add(thing);
        }
    }

    public String toString() {
        int currentThings = this.things.size();
        int currentWeight = this.totalWeight();

        switch (currentThings) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return currentThings + " thing (" + currentWeight + " kg)";
            default:
                return currentThings + " things (" + currentWeight + " kg)";
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Thing i : this.things) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        System.out.println("Your suitcase contains the following things:");
        for (Thing thing : this.things) {
            System.out.println(thing.toString());
        }
    }

    public Thing heaviestThing() {
        
        Thing heaviestThing = null;
        if (this.things.isEmpty()) {
            return null;
        } else {
            int heaviestWeight = 0;
            for (Thing thing : this.things) {
                if (thing.getWeight() > heaviestWeight) {
                    heaviestWeight = thing.getWeight();
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
    }
    
}
