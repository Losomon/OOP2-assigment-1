class Vehicle {//solomon mwangi ct101/g/20741/23
    protected String brand; 
    protected int speed;

    // Constructor to initialize the vehicle's brand and speed
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to accelerate the vehicle by increasing its speed
    public void accelerate(int increase) {
        speed += increase;
    }

    // Method to slow down the vehicle by decreasing its speed
    // Ensures that the speed doesn't go below 0
    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease); // Keep speed at a minimum of 0
    }

    // Method to display the vehicle's brand and speed
    public void showDetails() {
        System.out.println("Vehicle Details: Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int fuelLevel;

    // Constructor to initialize car's brand, speed, and fuel level
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = Math.min(fuelLevel, 100); // Ensure fuel doesn't exceed 100%
    }

    // Method to refuel the car
    // Ensures that fuel level does not exceed 100%
    public void refuel(int amount) {
        fuelLevel = Math.min(fuelLevel + amount, 100); // Max fuel level is 100%
    }

    // Overridden method to display car details, including fuel level
    @Override
    public void showDetails() {
        System.out.println("Car Details: Brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}

class Bike extends Vehicle {
    private boolean helmetOn;

    // Constructor to initialize bike's brand, speed, and helmet status
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // Method to put on the helmet
    public void wearHelmet() {
        helmetOn = true;
    }

    // Overridden method to display bike details, including helmet status
    @Override
    public void showDetails() {
        System.out.println("Bike Details: Brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // Create a new Car object with specific brand, speed, and fuel level
        Car car = new Car("Toyota", 60, 50);

        // Perform actions on the car: accelerate, brake, refuel, and display details
        car.accelerate(20);  // Increase speed by 20
        car.brake(30);       // Reduce speed by 30
        car.refuel(30);      // Add 30 units of fuel
        car.showDetails();   // Show the car's details

        // Create a new Bike object with specific brand, speed, and helmet status
        Bike bike = new Bike("Yamaha", 40, false);

        // Perform actions on the bike: accelerate, brake, wear helmet, and display details
        bike.accelerate(15);  // Increase speed by 15
        bike.brake(10);       // Reduce speed by 10
        bike.wearHelmet();    // Put on the helmet
        bike.showDetails();   // Show the bike's details
    }
}
