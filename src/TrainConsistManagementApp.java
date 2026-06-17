class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==========================================\n");

        try {
            // Valid Case
            String type1 = "Sleeper";
            int capacity1 = 72;
            if (capacity1 <= 0) throw new InvalidCapacityException("Capacity must be greater than zero");
            System.out.println("Created Bogie: " + type1 + " -> " + capacity1);

            // Invalid Case
            int capacity2 = -10; // Or 0
            if (capacity2 <= 0) throw new InvalidCapacityException("Capacity must be greater than zero");

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}

class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {
    public static void validateAndAssign(String bogieShape, String cargoType) {
        try {
            if (bogieShape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
            System.out.println("Cargo assigned successfully -> " + cargoType);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo validation completed for " + bogieShape + " bogie");
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("==========================================");
        System.out.println();

        // Test Case 1: Safe Assignment
        validateAndAssign("Cylindrical", "Petroleum");
        System.out.println();

        // Test Case 2: Unsafe Assignment
        validateAndAssign("Rectangular", "Petroleum");
        System.out.println();

        System.out.println("UC15 runtime handling completed...");
    }
}