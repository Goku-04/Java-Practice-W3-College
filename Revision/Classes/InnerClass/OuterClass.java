public class OuterClass {
    private int outerField;
    
    
    // inner Class
    public class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        public void display() {
            System.out.println("OuterField: " + outerField);
            System.out.println("InnerField: " + innerField);
        }
    }

    
}

class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(5);
        innerObj.display();
    }
}