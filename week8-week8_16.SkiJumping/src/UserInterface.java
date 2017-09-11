
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
    private final ArrayList<Jumper> jumpers;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();
    }

    public void start() {

        printIntro();

        getJumpers();

        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();

        int roundNumber = 1;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = this.reader.nextLine();
            input = input.toLowerCase().trim();
            if (input.equals("jump")) {
                startRound(roundNumber);
                roundNumber++;
            } else {
                System.out.println();
                System.out.println("Thanks!");
                System.out.println();
                break;
            }
        }
        
        printResults();

    }

    public void printIntro() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    public void getJumpers() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = this.reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Jumper newJumper = new Jumper(name);
            this.jumpers.add(newJumper);
        }
    }

    public void printJumpers() {
        int i = 1;
        System.out.println("Jumping order:");
        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + i + ". " + jumper);
            i++;
        }
    }

    public int calculateJudgesVotes(int[] votes) {
        Arrays.sort(votes);
        int sum = 0;
        for (int i = 1; i < votes.length - 1; i++) {
            sum += votes[i];
        }
        return sum;
    }

    public void startRound(int roundNumber) {
        System.out.println();
        System.out.println("Round " + roundNumber);

        System.out.println();
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        printJumpers();
        System.out.println();
        System.out.println("Results of round " + roundNumber);
        for (Jumper jumper : this.jumpers) {
            Random rn = new Random();
            int length = rn.nextInt(61) + 60;
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + length);
            int[] votes = {0, 0, 0, 0, 0};
            String voteString = "[";
            for (int i = 0; i < votes.length; i++) {
                votes[i] = rn.nextInt(11) + 10;
                if (i != votes.length - 1) {
                    voteString += votes[i] + ", ";
                } else {
                    voteString += votes[i] + "]";
                }
            }
            System.out.println("    judge votes: " + voteString);
            jumper.addPoints(length + calculateJudgesVotes(votes));
            jumper.addLength(length);
        }
        System.out.println();
        
    }

    public void printResults() {
        Collections.sort(jumpers);
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int i = 1;
        for (Jumper jumper : this.jumpers){
            System.out.println(i + "           " + jumper);
            System.out.println(jumper.getLengths());
            i++;
        }
    }

}
