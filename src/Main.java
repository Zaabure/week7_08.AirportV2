import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

//        Airplane letadlo = new Airplane("OK-1", 111);
//
        Scanner reader = new Scanner(System.in);

//        letadlo.addFlight("PRAHA", "PARDUBICE");
//        letadlo.addFlight("PARDUBICE", "PRAHA");
//        letadlo.addFlight("PARDUBICE", "ZAHREB");
//        letadlo.addFlight("ZAHREB", "BERLIN");
//
//    letadlo.printFlights();
        UserInterface ui = new UserInterface(reader);
        ui.start();

    }
}
