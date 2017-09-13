/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.*;
import moving.domain.*;

/**
 *
 * @author pkennedy
 */
public class Packer {
    private Box box;
    private List<Box> boxes;
    
    public Packer(int boxesVolume){
        this.box = new Box(boxesVolume);
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
        if(things.isEmpty() == false){
            this.boxes.add(box);
            for (Thing t: things){
                if(this.box.addThing(t) == true){
                    
                } else{
                    Box newBox = new Box(this.box);
                    newBox.addThing(t);
                    this.boxes.add(newBox);
                }
            }
        }
        return this.boxes;
    }   
}
