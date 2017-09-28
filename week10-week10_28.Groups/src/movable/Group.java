/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class Group implements Movable{
    private ArrayList<Movable> group;
    
    public Group(){
        this.group = new ArrayList<Movable>();
    }

    public String toString(){
        String positions = "";
        for (Movable o :this.group){
             positions += o.toString() + "\n";
        }
        return positions;
    }
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable o: this.group){
            o.move(dx, dy);
        }
    }
    
    
    
    
}
