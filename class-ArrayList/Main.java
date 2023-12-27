import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class for sorting ArrayList

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList object called cars that will store strings
        ArrayList<String> cars = new ArrayList<String>();

        // add elements to the ArrayList, use the add() method
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("Mazda");
        System.out.println(cars);

        // get an element
        System.out.printf("Get an element: ");
        System.out.println(cars.get(0));

        // modify an element
        System.out.println("Modify an element: ");
        cars.set(0, "Opel");
        System.out.println(cars);

        // remove an element
        System.out.println("Remove an element: ");
        cars.remove(0);
        System.out.println(cars);

        // get size
        System.out.printf("Get size of ArrayList: ");
        System.out.println(cars.size());

        // loop through ArrayList
        System.out.println("Loop through array: ");
        for (int i = 0, size = cars.size(); i < size; i++) {
            System.out.println(cars.get(i));
        }
        // sort the list and iterate using for-each loop
        Collections.sort(cars);
            // using for-each loop
            System.out.println("Loop using for-each loop with sort: ");
            for (String i: cars) {
                System.out.println(i);
            }

        // clear the ArrayList
        System.out.println("Clear the ArrayList: ");
        cars.clear();
        System.out.println(cars);
    }
}
