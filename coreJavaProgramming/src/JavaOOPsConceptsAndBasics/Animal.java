package JavaOOPsConceptsAndBasics;

public class Animal {
    String color = "white";

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    String color = "black";

    void displayColor() {
        System.out.println(color); //child class variable value
        System.out.println(super.color); //parent class variable value
    }

    void eat() {
        System.out.println("eating bread..."); //child class method value
        super.eat(); //parent class method value
    }
}
