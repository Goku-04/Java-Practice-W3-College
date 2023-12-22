public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        // Usage
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}