import java.util.*;
public class TrainConsistManagement {
    public static void main(String[] args) {
        List<String> passengerBoots = new ArrayList<>();

        System.out.println("\n======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================\n");

        passengerBoots.add("Sleeper");
        passengerBoots.add("AC Chair");
        passengerBoots.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBoots);

        passengerBoots.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBoots);

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBoots.contains("Sleeper"));

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBoots);

        System.out.println("\nUC2 operations completed successfully...");


    }
}
