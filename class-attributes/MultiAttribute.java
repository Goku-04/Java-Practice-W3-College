public class MultiAttribute {
    int x = 5;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String args[]) {
        // creating multiple objects
        MultiAttribute obj1 = new MultiAttribute();
        MultiAttribute obj2 = new MultiAttribute();
        
        // modifying value of attribute x for obj1
        obj1.x = 4;

        // declaring another object after modifying x for obj1
        MultiAttribute obj3 = new MultiAttribute();

        // printing attribute value for both obj1, obj2, obj3
        // we observe the attribute value does not modify for obj2 and obj3
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);  
        
        MultiAttribute obj4 = new MultiAttribute();
        System.out.println("Name: " + obj4.fname + " " + obj4.lname);
        System.out.println("Age: " + obj4.age);
    }
}