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
public class Reader {
    private Scanner scanner;
    
    public Reader(){
        this.scanner = new Scanner(System.in);
    }
    
    public String readString(){
        String input = this.scanner.nextLine();
        return input;
    }
    
    public int readInteger(){
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
    
    
    
}
