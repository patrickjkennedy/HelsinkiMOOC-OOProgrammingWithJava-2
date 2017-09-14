
import java.io.*;
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
public class Printer {

    private Scanner reader;
    private File f;

    public Printer(String filename) throws Exception {
        this.f = new File(filename);
        
    }

    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(f);
        if (word.equals("")) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }

}
