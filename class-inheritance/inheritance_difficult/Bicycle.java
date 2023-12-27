public class Bicycle {
    // Bicycle has three fields
    public int cadence;
    public int gear;
    public int speed;

    // Bicycle has one constructor
    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    // Bicycle has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp (int increment) {
        speed += increment;
    }
}
