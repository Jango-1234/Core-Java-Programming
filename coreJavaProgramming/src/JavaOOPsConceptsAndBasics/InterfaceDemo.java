package JavaOOPsConceptsAndBasics;

interface Shape {
    int length = 10; //final & static
    int width = 20; //final & static

    void circle(); //abstrct method

    default void square() {
        System.out.println("this is square - default menthod");
    }

    static void rectangle() {
        System.out.println("this is rectangle - static method");

    }
}


public class InterfaceDemo implements Shape {
    public void circle() {
        System.out.println("this is circle - abstract method..");
    }

    void triangle(){
        System.out.println("this is triangle..");
    }

    int x=100,y=200;

    public static void main(String[] args) {
        //1
        InterfaceDemo idobj = new InterfaceDemo();
        idobj.circle(); //abstarct
        idobj.square(); //default
        Shape.rectangle(); // static method can directly access from interface
        idobj.triangle();
        System.out.println(idobj.x+idobj.y);

        //2
        Shape sh = new InterfaceDemo(); // variable pf interface can hold object of the class
        sh.circle(); //abstract
        sh.square(); //default
        Shape.rectangle(); // static method can directly access from interface
        //sh.triangle() --> triangle method is not available in Shape interface
        System.out.println(Shape.length * Shape.width); //Accessing  static variables directly
        //System.out.println(sh.x+sh.y); --> Compilation error --> we cannot access
    }
}
