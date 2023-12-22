public class OuterClass {
    public void outerMethod() {
        int localVar = 20;

        class LocalInnerClass {
            public void display() {
                System.out.println("Local Variable: " + localVar);
            }
        }
        LocalInnerClass innerobj = new LocalInnerClass();
        innerobj.display();
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    }
}