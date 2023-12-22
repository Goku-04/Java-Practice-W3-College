public class OuterClass {
    private static int outerStaticField;
    private int outerField;

    public static class StaticNestedClass {
        private int nestedField;

        public StaticNestedClass(int nestedField) {
            this.nestedField = nestedField;
        }

        public void display() {
            System.out.println("Outer Static Field: " + outerStaticField);
            System.out.println("Inner Nested Field: " + nestedField);
            // System.out.println("Outer Field: " + outerField); : Raises error because non-static member of outerclass
        }
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass(10);
        nestedObj.display(); 
    }
}