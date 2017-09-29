/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class ContainerHistory {

    private final ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }
    
    public double average(){
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        
        for (double d : this.history){
            sum += d;
        }
        return sum/ (double) this.history.size();
    }
    
    public double greatestFluctuation(){
        
    }

}
