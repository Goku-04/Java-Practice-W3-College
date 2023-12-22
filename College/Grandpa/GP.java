class GP {
    
    private void privateVar() {
        System.out.println("This is private variable");
    }
    
    protected void protectedVar() {
        System.out.println("This is protected variable");
    }
    
    void defaultVar() {
        System.out.println("This is default variable");
    }
    
    public void publicVar() {
        System.out.println("This is public variable");
    }
}

class Parent extends GP {
    // private function
        
        // PRIVATE TO PROTECTED
        // protected void privateVar() {
        //     System.out.println("This is private variable");
        // }
        
        // PRIVATE TO DEFAULT
        // void privateVar() {
        //     System.out.println("This is private variable");
        // }
        
        // PRIVATE TO PUBLIC
        // public void privateVar() {
        //     System.out.println("This is private variable");
        // }
    

    // protected function
    
        // PROTECTED TO PRIVATE
        //     GP.java:38: error: protectedVar() in Parent cannot override protectedVar() in GP
        //     private void protectedVar() {
        //                  ^
        //   attempting to assign weaker access privileges; was protected
        // GP.java:57: error: protectedVar() has private access in Parent
        //         obj.protectedVar();
        //            ^
        // 2 errors
        // private void protectedVar() {
        //     System.out.println("This is protected variable");
        // }
    
        // PROTECTED TO DEFAULT
        //     GP.java:52: error: protectedVar() in Parent cannot override protectedVar() in GP
        //     void protectedVar() {
        //          ^
        //   attempting to assign weaker access privileges; was protected
        // 1 error
        // void protectedVar() {
        //     System.out.println("This is protected variable");
        // }
    
        // PROTECTED TO PUBLIC
        // public void protectedVar() {
        //     System.out.println("This is protected variable");
        // }


    // default function
    
        // DEFAULT TO PRIVATE
        //     GP.java:72: error: defaultVar() in Parent cannot override defaultVar() in GP
        //     private void defaultVar() {
        //                  ^
        //   attempting to assign weaker access privileges; was package
        // GP.java:98: error: defaultVar() has private access in Parent
        //         obj.defaultVar();
        //            ^
        // 2 errors
        // private void defaultVar() {
        //     System.out.println("This is default variable");
        // }

        // DEFAULT TO PROTECTED
        // protected void defaultVar() {
        //     System.out.println("This is default variable");
        // }
    
        // DEFAULT TO PUBLIC
        // public void defaultVar() {
        //     System.out.println("This is default variable");
        // }


    // public
        // PUBLIC TO PRIVATE
        //     GP.java:98: error: publicVar() in Parent cannot override publicVar() in GP
        //     private void publicVar() {
        //                  ^
        //   attempting to assign weaker access privileges; was public
        // GP.java:127: error: publicVar() has private access in Parent
        //         obj.publicVar();
        //            ^
        // 2 errors
        // private void publicVar() {
        //     System.out.println("This is public variable");
        // }
    
        // PUBLIC TO PROTECTED
        //         GP.java:111: error: publicVar() in Parent cannot override publicVar() in GP
        //     protected void publicVar() {
        //                    ^
        //   attempting to assign weaker access privileges; was public
        // 1 error 
        // protected void publicVar() {
        //     System.out.println("This is public variable");
        // }
        
        // PUBLIC TO DEFAULT
        //             GP.java:120: error: modifier default not allowed here
        //     default void publicVar() {
        //                 ^
        // 1 error
        // default void publicVar() {
        //     System.out.println("This is public variable");
        // }
    
    

}

class Main {
    public static void main(String args[]) {
        Parent obj = new Parent();
        // private
        // obj.privateVar();
        
        // protected
        // obj.protectedVar();
        
        // default
        // obj.defaultVar();

        // public 
        // obj.publicVar();
    }
}