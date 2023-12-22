interface Greeting {
    void greet();
}

public class OuterClass {
    public void displayGreeting() {
        Greeting anonGreeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from anonymous inner Class");
            }
        };
        anonGreeting.greet();
    }
}