/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author pkennedy
 */
public class Student extends Person{
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study(){
        this.credits++;
    }
    
    public int credits(){
        return this.credits;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "  credits " + this.credits;
    }
    
}
