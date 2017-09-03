
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
public class Flights {
    private HashMap<String,Plane> flights;
    
    public Flights(){
        this.flights = new HashMap<String, Plane>();
    }
    
    public void addFlight(String route, Plane plane){
        this.flights.put(route, plane);
    }
    
    public void printFlights(){
        for(String route: this.flights.keySet()){
            System.out.println(this.flights.get(route) + " " + route);
        }
        System.out.println();
    }
}
