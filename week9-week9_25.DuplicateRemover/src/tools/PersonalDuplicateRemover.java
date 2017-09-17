/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pkennedy
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> characterSet;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        this.characterSet = new HashSet<String>();
        this.duplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(this.characterSet.contains(characterString)){
            this.duplicates++;
        }
        this.characterSet.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.characterSet;
    }

    @Override
    public void empty() {
        this.duplicates = 0;
        this.characterSet.clear();
    }
    
}
