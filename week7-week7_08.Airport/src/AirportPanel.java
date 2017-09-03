
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
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            String input = getInput();

            if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x") || input.equals("X")) {
                flightService();
                break;
            } else {
                System.out.println("Unknown command, please try again.");
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
                String route = "(" + depCode + "-" + arrCode + ")";
                this.flights.addFlight(route, plane);
            }
        }
    }

    public void flightService() {
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while (true) {
            String input = getInputFlightService();

            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                this.flights.printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            } else if (input.equals("x") || input.equals("X")) {
                break;
            } else {
                System.out.println("Unknown command, please try again.");
            }
        }
    }

    public String getInput() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        String input = this.reader.nextLine();
        return input;
    }

    public String getInputFlightService() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        String input = this.reader.nextLine();
        return input;
    }

    public void printPlanes() {
        for (Plane plane : this.planes) {
            System.out.println(plane);
        }
    }

    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        
        for(Plane plane: this.planes){
            if(id.equals(plane.getId())){
                System.out.println(plane);
            }
        }
    }

}
