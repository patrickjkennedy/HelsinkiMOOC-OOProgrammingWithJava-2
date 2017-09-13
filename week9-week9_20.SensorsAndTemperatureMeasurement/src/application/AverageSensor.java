/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pkennedy
 */
public class AverageSensor implements Sensor {

    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors){
            s.off();
        }
    }

    @Override
    public int measure() {
        if (this.sensors.isEmpty()){
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor s : this.sensors){
            sum += s.measure();
        }
        int reading = sum / this.sensors.size();
        this.readings.add(reading);
        return reading;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }

}
