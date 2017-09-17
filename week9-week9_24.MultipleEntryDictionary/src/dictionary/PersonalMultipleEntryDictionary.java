/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author pkennedy
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set<String>> dictionary;
    
    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, Set<String>>();
    }
    
    
    @Override
    public void add(String word, String entry) {
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new HashSet<String>());
        }
            
            // First we retrieve the set containing the translations and then add
            // the new translation.
            
            Set<String> translations = this.dictionary.get(word);
            translations.add(entry);
    
    }

    @Override
    public Set<String> translate(String word) {
        if(!this.dictionary.containsKey(word)){
            return null;
        }
        Set<String> translations = this.dictionary.get(word);
        return translations;
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);
    }
    
}
