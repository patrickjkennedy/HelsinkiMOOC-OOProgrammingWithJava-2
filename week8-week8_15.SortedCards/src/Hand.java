
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
public class Hand implements Comparable<Hand> {
    private final ArrayList<Card> hand = new ArrayList<Card>();
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card c : this.hand){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.totalValue() - hand.totalValue();
    }
    
    public int totalValue(){
        int totalValue = 0;
        for (Card c : this.hand){
            totalValue += c.getValue();
        }
        return totalValue;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
        System.out.println(this.hand);
    }
    
}


