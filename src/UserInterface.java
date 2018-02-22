import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private ArrayList<Airplane> listOfPlanes;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        listOfPlanes = new ArrayList<Airplane>();
    }

    private void displayAirportPanel() {
        String input = "";
        System.out.println("Airport panel\n" +
                "--------------------\n");
        while (!input.equals("x")) {
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit");

            System.out.print("> ");
            input = reader.nextLine();
            if (input.equals("1"))
                addPlane();
            else if (input.equals("2"))
                addFlight();
            else if (input.equals("x"))
                break;
            else
                System.out.println("Unknown Command");
        }
    }

    private void addFlight() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String source = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destination = reader.nextLine();

        //je potreba najit spravne letadlo dle ID a vytvorit pro nej let
        for (Airplane airplane : listOfPlanes) {
            if (id.equals(airplane.getId())) {
                airplane.addFlight(source, destination);
                break;
            }
        }
    }

    private void addPlane() {
        System.out.println("Give plane ID:");
        String id = reader.nextLine();
        System.out.println("Give plane capacity:");
        int capacity = Integer.parseInt(reader.nextLine());
        listOfPlanes.add(new Airplane(id, capacity));
    }

    public void start() {
        displayAirportPanel();
        displayFlightService();
    }

    private void displayFlightService() {
        System.out.println("Flight service\n" +
                "------------");
        String input = "";
        while (!input.equals("x")) {
            System.out.println("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit");
            System.out.print("> ");
            input = reader.nextLine();
            if (input.equals("1"))
                printPlanes();
            else if (input.equals("2"))
                printFlights();
            else if (input.equals("3"))
                printPlaneInfo();
            else if (input.equals("x"))
                break;
            else
                System.out.println("Unknown Command");

        }
    }

    private void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        for (Airplane plane : listOfPlanes) {
            if (id.equals(plane.getId())) {
                System.out.println(plane.toString());
                break;
            }
        }
    }

    private void printFlights() {
        for (Airplane plane : listOfPlanes) {
            plane.printFlights();
        }
    }

    private void printPlanes() {
        for (Airplane plane : listOfPlanes)
            System.out.println(plane.toString());
    }
}
