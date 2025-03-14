public class Car {

    // This variable holds the car's license plate number. It's private, meaning only this class can directly access it.
    private final String licensePlate;

    // This variable tells us whether the car is currently rented out or not. It's also private.
    private boolean isRented;

    // This is how we create a new Car object. We need to give it a license plate when we make it.
    public Car(String licensePlate) {
        // We set the car's license plate to the value we were given.
        this.licensePlate = licensePlate;
        // When a new car is created, it's not rented out yet, so we set it to false.
        this.isRented = false;
    }

    // This method lets someone rent the car.
    public boolean rentCar() {
        // First, we check if the car is already rented.
        if (!isRented) { // If it's NOT rented
            // we rent it out! We set isRented to true.
            isRented = true;
            // And we tell them it was successful by returning true.
            return true;
        } else { // If it IS already rented...
            // ...we tell them it's not available by returning false.
            return false;
        }
    }

    // This method is how we return the car after it's been rented.
    public void returnCar() {
        // We simply set isRented to false, which means the car is now available again.
        isRented = false;
    }

    // This method lets us check if the car is currently rented.
    public boolean isRented() {
        // It simply returns the value of isRented, which tells us if it's rented or not.
        return isRented;
    }

    // (Optional but good practice) This method lets us get the car's license plate.
    public String getLicensePlate() {
        // It returns the license plate number.
        return licensePlate;
    }
}