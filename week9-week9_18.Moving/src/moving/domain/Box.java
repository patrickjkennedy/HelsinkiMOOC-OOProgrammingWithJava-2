/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> contents;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.contents = new ArrayList<Thing>();
    }

    public Box(Box box) {
        this.contents = new ArrayList<Thing>();
        this.maximumCapacity = box.maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() <= this.maximumCapacity) {
            this.contents.add(thing);
            return true;
        } else return false;
    }

    @Override
    public int getVolume() {
        int totalVolume = 0;
        for (Thing thing : this.contents) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }

}
