/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.*;
import java.util.*;

/**
 *
 * @author pkennedy
 */
public class WordInspection {

    private ArrayList<String> lines;

    public WordInspection(File file) throws Exception {
        Scanner reader;
        try {
            reader = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("No file found.");
            return;
        }

        this.lines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            this.lines.add(reader.nextLine());
        }
    }

    public int wordCount() {
        int count = 0;
        for (String line : this.lines) {
            count++;
        }
        return count;
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> wordsContainingZ = new ArrayList<String>();

        for (String line : this.lines) {
            if (line.contains("z") || line.contains("Z")) {
                wordsContainingZ.add(line);
            }
        }
        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> wordsEndingL = new ArrayList<String>();

        for (String line : this.lines) {
            if (line.endsWith("l") || line.endsWith("L")) {
                wordsEndingL.add(line);
            }
        }
        return wordsEndingL;
    }

    public List<String> palindromes() {
        ArrayList<String> palindromes = new ArrayList<String>();

        for (String line : this.lines) {
            if (line.equals(reverse(line))) {
                palindromes.add(line);
            }
        }
        return palindromes;
    }

    public String reverse(String string) {

        char[] charString = string.toCharArray();
        String reverse = "";

        for (int i = charString.length - 1; i >= 0; i--) {
            reverse += charString[i];
        }
        return reverse;
    }

    public List<String> wordsWhichContainAllVowels() {
        ArrayList<String> wordsWhichContainAllVowels = new ArrayList<String>();

        for (String line : this.lines) {
            if (line.contains("a") && line.contains("e") && line.contains("i")
                    && line.contains("o") && line.contains("u") && line.contains("y")
                    && line.contains("ä") && line.contains("ö")) {
                wordsWhichContainAllVowels.add(line);
            }

        }
        return wordsWhichContainAllVowels;
    }

}
