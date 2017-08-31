/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {

        String word = characterString;

        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (character == this.fromCharacter) {
                newWord += this.toCharacter;
            } else {
                newWord += character;
            }
        }

        return newWord;
    }

}
