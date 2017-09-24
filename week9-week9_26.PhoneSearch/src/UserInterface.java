
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
public class UserInterface {

    private final Scanner reader;
    private final PhoneBook phonebook;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.phonebook = new PhoneBook();
    }

    public void start() {
        printIntro();
        programLoop();
    }

    public void printIntro() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        System.out.println();
    }

    public String command() {
        System.out.print("command: ");
        return this.reader.nextLine();
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String num = this.reader.nextLine();
        this.phonebook.add(name, num);
        System.out.println();
    }

    public void searchByName() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        this.phonebook.searchByName(name);
        System.out.println();
    }

    public void programLoop() {
        while (true) {
            try {
                int command2Int = Integer.parseInt(command());
                if (command2Int == 1) {
                    addNumber();
                } else if (command2Int == 2) {
                    searchByName();
                }
            } catch (NumberFormatException e) {
                break;
            }

        }
    }
}
