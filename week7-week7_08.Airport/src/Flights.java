
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
    private HashMap<Plane,String> flights;
    
    public Flights(){
        this.flights = new HashMap<Plane, String>();
    }
    
    public void addFlight(Plane plane, String flight){
        this.flights.put(plane, flight);
    }
    
    public String getFlight(Plane plane){
        String flight = this.flights.get(plane);
        return flight;
    }
}
