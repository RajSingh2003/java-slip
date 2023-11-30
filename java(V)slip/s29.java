import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: $" + price);
        System.out.println("Capacity in Tons: " + capacityInTons + " tons");
    }
}

public class s29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the type of vehicle (Light / Heavy):");
            String vehicleType = scanner.nextLine();

            System.out.print("Enter company name: ");
            String company = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if (vehicleType.equalsIgnoreCase("Light")) {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                LightMotorVehicle lightVehicle = new LightMotorVehicle(company, price, mileage);
                lightVehicle.display();
            } else if (vehicleType.equalsIgnoreCase("Heavy")) {
                System.out.print("Enter capacity in tons: ");
                double capacityInTons = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                HeavyMotorVehicle heavyVehicle = new HeavyMotorVehicle(company, price, capacityInTons);
                heavyVehicle.display();
            } else {
                System.out.println("Invalid vehicle type entered.");
            }
        }
        scanner.close();
    }
}