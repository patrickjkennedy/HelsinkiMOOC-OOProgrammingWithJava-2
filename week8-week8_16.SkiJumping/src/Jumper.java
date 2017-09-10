
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
public class Jumper {
    private final String name;
    private int points;
    private final ArrayList<Integer> lengths;
    
    public Jumper(String name){
        this.name = name;
        this.points = 0;
        this.lengths = new ArrayList<Integer>();
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.points + " points)";
    }
    
    public void addPoints(int points){
        this.points += points;
    }
    
    public void addLength(int length){
        lengths.add(length);
    }
    
    public String getName(){
        return this.name;
    }
}
