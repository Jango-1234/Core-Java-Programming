package JavaOOPsConceptsAndBasics;

//Super class
class MethodOverriding1 {
    void draw() {
        System.out.println("Draw a circle");
    }

}

//Subclass
class ChildClassMethodOverriding extends MethodOverriding {
    @Override
    void draw() {
        System.out.println("Draw a rectangle");
    }
}


class Main {
    public static void main(String[] args) {
        //Reference of superclass and object of subclass
        MethodOverriding child = new ChildClassMethodOverriding();

        // Calls the overridden method in ChildClassMethodOverriding class
        child.draw();
    }
}

/* Another standard example -->
// Superclass
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Reference of superclass and object of subclass
        Animal myDog = new Dog();

        // Calls the overridden method in Dog class
        myDog.sound(); // Output: Dog barks
    }
}

Explanation:
In the Animal class, a method sound() is defined.
The Dog class extends Animal and overrides the sound() method to provide its specific implementation.
When myDog.sound() is called, the Dog class's sound() method is executed, not the Animal class's method.
This is an example of runtime polymorphism in Java, where the method that gets called is determined at runtime based on the object's type.

*/
