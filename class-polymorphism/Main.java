import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Dog obj2 = new Dog();
        Cat obj3 = new Cat();
        Animal ref;
        
        System.out.println("What sound to produce?");
        System.out.println("1. Bark");
        System.out.println("2. Meow");
        int i = input.nextInt();
        switch (i) {
            case 1:
                ref = obj2;
                ref.sound();
                break;
            
            case 2:
                ref= obj3;
                ref.sound();
            default:
                break;
        }
    }
}