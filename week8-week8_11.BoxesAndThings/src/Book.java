/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Book implements ToBeStored {
    private final String writer;
    private final String name;
    private final double weight;
    
    public Book(String writer, String name, double weight){
        this.weight = weight;
        this.name = name;
        this.writer = writer;
    }
    
    public String getWriter(){
        return this.writer;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString(){
        return getWriter() + ": " + getName();
    }
    
}
