import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] userArray = new int[size];

        // Get elements for the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        // Display the entered array
        System.out.println("Entered array:");
        for (int i :userArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}