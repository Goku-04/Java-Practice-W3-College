class Vehicle {
    protected String brand = "Ford"; // Vehicle Attribute
    public void honk() {             // Vehicle Method
        System.out.println("Tuut, Tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang"; // Car Attribute
    public static void main(String[] args) {
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}