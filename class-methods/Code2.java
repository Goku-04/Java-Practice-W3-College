public class Code2 {
    // static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String args[]) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); // This would give a compilation error

        Code2 myObj = new Code2(); // Create an object of Code2 class
        myObj.myPublicMethod(); // Call the public method on object
    }
}