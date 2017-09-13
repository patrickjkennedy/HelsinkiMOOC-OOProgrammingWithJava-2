/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author pkennedy
 */
public class Main {
    public static void main(String[] args) {
    Sensor kumpula = new ConstantSensor(10);
    kumpula.on();
    System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

    Sensor kaisaniemi = new ConstantSensor(15);
    Sensor helsinkiVantaa = new ConstantSensor(20);
    Sensor asdfVantaa = new ConstantSensor(25);
    Sensor eeeVantaa = new ConstantSensor(27);

    AverageSensor helsinkiArea = new AverageSensor();
    helsinkiArea.addSensor(kumpula);
    helsinkiArea.addSensor(kaisaniemi);
    helsinkiArea.addSensor(helsinkiVantaa);
    helsinkiArea.addSensor(asdfVantaa);
    helsinkiArea.addSensor(eeeVantaa);

    helsinkiArea.on();
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
}
    
}
