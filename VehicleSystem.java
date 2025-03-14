class Vehicle {
    protected String brand; 
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
    }

    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease); // Ensure speed doesn't go below zero
    }

    public void showDetails() {
        System.out.println("Vehicle Details: Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int fuelLevel;

    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = Math.min(fuelLevel, 100); // Ensure fuelLevel doesn't exceed 100
    }

    public void refuel(int amount) {
        fuelLevel = Math.min(fuelLevel + amount, 100); // Ensure fuelLevel doesn't exceed 100
    }

    @Override
    public void showDetails() {
        System.out.println("Car Details: Brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}

class Bike extends Vehicle {
    private boolean helmetOn;

    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    public void wearHelmet() {
        helmetOn = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bike Details: Brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // Instantiate a Car object
        Car car = new Car("Toyota", 60, 50);

        // Perform actions on the Car
        car.accelerate(20);
        car.brake(30);
        car.refuel(30);
        car.showDetails();

        // Instantiate a Bike object
        Bike bike = new Bike("Yamaha", 40, false);

        // Perform actions on the Bike
        bike.accelerate(15);
        bike.brake(10);
        bike.wearHelmet();
        bike.showDetails();
    }
}