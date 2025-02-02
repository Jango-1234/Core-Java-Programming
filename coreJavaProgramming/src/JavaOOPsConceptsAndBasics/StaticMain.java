package JavaOOPsConceptsAndBasics;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(StaticDemo.a); //className.variable -if main method is in another class
        StaticDemo.m1(); //className.method -if main method is in another class

        //System.out.println(b); cannot access, b isnon-static variable
        //m2(); //cannot access, m2() is non-static method

        //2) static methods can access non-static stuff through object
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m();
    }
}
