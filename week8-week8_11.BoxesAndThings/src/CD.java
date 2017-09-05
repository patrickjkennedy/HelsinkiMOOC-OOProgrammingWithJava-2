/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class CD implements ToBeStored{

    private final double weight;
    private final String artist;
    private final String title;
    private final int publishingYear;
    
    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPublishingYear(){
        return this.publishingYear;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return getArtist() + ": " + getTitle() + " (" + getPublishingYear() + ")";
    }
    
    
    
}
