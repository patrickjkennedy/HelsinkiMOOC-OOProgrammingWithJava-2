/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author pkennedy
 */
public class PhoneBook {

    private final Map<String, Set<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<String, Set<String>>();
    }

    public void add(String name, String num) {

        if (!this.phonebook.containsKey(name)) {
            this.phonebook.put(name, new HashSet<String>());
        }

        Set<String> numbers = this.phonebook.get(name);
        numbers.add(num);
    }

    public void searchByName(String searchName) {
        try {
            System.out.println(this.phonebook.get(searchName).toString()
                    .replace("[", " ").replace(", ", "\n" + " ").replace("]", ""));
        } catch (Exception e) {
            System.out.println("  phone number not found");
        }

    }

}
