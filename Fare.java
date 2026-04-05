package level5;
import java.util.Scanner;

class Pricing {
    double baseFare = 200;
    double costPerKm = 50;
    
    double calculateFare(double distance) {
        return baseFare + (distance * costPerKm);
    }
}

public class Fare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pricing ride = new Pricing();
        
        System.out.print("Enter distance (km): ");
        double distance = scanner.nextDouble();
        
        double fare = ride.calculateFare(distance);
        System.out.println("Total fare: " + fare + " KES");
        
        scanner.close();
    }
}