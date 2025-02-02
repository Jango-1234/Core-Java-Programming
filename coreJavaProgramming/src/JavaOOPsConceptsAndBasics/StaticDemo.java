package JavaOOPsConceptsAndBasics;

public class StaticDemo {

    static int a = 10; // static variable
    int b = 20; // non-static variable

    //1) static methods can access static stuff directly (without object)
    static void m1() { //static method
        System.out.println("This is m1 static method...");
    }

    void m2() { // non-static method
        System.out.println("This is m2 non-static method...");
    }

    //3) non-static methods can access everything directly
    void m() {    // non-static method
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {
        System.out.println(a);
        m1();

        //System.out.println(b); cannot access, b isnon-static variable
        //m2(); //cannot access, m2() is non-static method

        //2) static methods can access non-static stuff through object
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m();
    }
}
