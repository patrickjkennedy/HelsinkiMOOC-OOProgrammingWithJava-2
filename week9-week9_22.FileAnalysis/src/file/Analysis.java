/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pkennedy
 */
public class Analysis {

    private ArrayList<String> lines;

    public Analysis(File file) throws Exception {
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println("No file found.");
            return;
        }

        this.lines = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            this.lines.add(scanner.nextLine());
        }
    }

    public int lines(){
        int count = 0;
        for (String line : this.lines) {
            count++;
        }
        return count;
    }

    public int characters(){
        int count = 0;
        for (String line : this.lines) {
            count += line.length() + 1;
        }
        return count;
    }
}
