class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}


class Main {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for vote");
        }

        else {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        // Usage
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}