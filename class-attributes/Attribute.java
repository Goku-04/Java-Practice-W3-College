public class Attribute {
    // declaring and intialised attribute
    int x = 5;
    // unintialised attribute
    int y;
    // preventing modification of an attribute using final keyword
    final int z = 10;
    
    public static void main(String args[]) {
        Attribute obj1 = new Attribute();
        // printing default value of attribute
        System.out.println(obj1.x);
        
        // modifying the existing value of attribute
        obj1.x = 40;
        System.out.println(obj1.x);

        // default value of uninitialised attribute is 0 in java
        System.out.println(obj1.y);

        // set attribute value for uninitialised attribute
        obj1.y = 2;
        System.out.println(obj1.y); 

        // modifying value of final attribute generates an error
        // hence commenting out the below line
        /* obj1.z = 20; */
    }
}
