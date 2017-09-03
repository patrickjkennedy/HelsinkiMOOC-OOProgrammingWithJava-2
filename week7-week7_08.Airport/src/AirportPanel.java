
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
public class AirportPanel {

    private Scanner reader;
    private Flights flights;
    private ArrayList<Plane> planes;

    public AirportPanel() {
        this.reader = new Scanner(System.in);
        this.flights = new Flights();
        this.planes = new ArrayList<Plane>();
    }

    public void start() {

        System.out.println("Airport panel");
        System.out.println("------------------");
        System.out.println();
        System.out.println();

        while (true) {
            int input = getInput();
            switch (input) {
                case 1:
                    addPlane();
                    break;
                case 2:
                    addFlight();
                    break;
                case 3:
                    //flightService();
                default:
                    break;
            }

        }

    }

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());
        Plane plane = new Plane(id, capacity);
        if (!this.planes.contains(plane)) {
            this.planes.add(plane);
        } else {
            System.out.println("Plane already exists!");
        }
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();

        for (Plane plane : this.planes) {
            if (id.equals(plane.getId())) {
                System.out.print("Give departure airport code: ");
                String depCode = this.reader.nextLine();
                System.out.print("Give destination airport code: ");
                String arrCode = this.reader.nextLine();
                String flight = "(" + depCode + "-" + arrCode + ")";
                this.flights.addFlight(plane, flight);
            }
        }
    }

    public int getInput() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        int input = Integer.parseInt(this.reader.nextLine());
        return input;
    }

}
