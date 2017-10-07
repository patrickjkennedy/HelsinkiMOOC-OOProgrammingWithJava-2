/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class Cow implements Milkable, Alive{

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private final String name;
    private int udder;
    private double amountOfMilk;
    private Random r = new Random();

    private int randInt() {

        int Low = 0;
        int High = 30;
        int Result = r.nextInt(High - Low) + Low;
        return Result;
    }

    public Cow() {
        this.name = NAMES[randInt()];
        this.udder = 15 + new Random().nextInt(26);
    }

    public Cow(String name) {
        this.name = name;
        this.udder = 15 + new Random().nextInt(26);
    }

    public String getName() {
        return this.name;
    }
    
    public double getCapacity(){
        return this.udder;
    }

    public double getAmount(){
        return this.amountOfMilk;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.amountOfMilk + "/" + this.udder;
    }
    
    @Override
    public double milk(){
        double tempAmountOfMilk = this.amountOfMilk;
        this.amountOfMilk = 0;
        return tempAmountOfMilk;
    }
    
    @Override
    public void liveHour(){
        double milkProduced = Math.ceil(0.7 + (2 - 0.7) * r.nextDouble());
        if(this.amountOfMilk + milkProduced <= this.udder){
            this.amountOfMilk += milkProduced;
        }
    }
}
