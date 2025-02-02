package JavaOOPsConceptsAndBasics;

public class Adder {
    //Method overloading
    int a = 10, b = 20;

    void sum() { //1 No parameter
        System.out.println(a + b);
    }

    void sum(int x, int y) { //2 Have 2 parameters
        System.out.println(x + y);
    }

    void sum(int x, double y) { //3 DataType of parameters are different
        System.out.println(x + y);
    }

    void sum(double x, int y) { //4 Order of parameters are different
        System.out.println(x + y);
    }

    void sum(int a, int b, int c) { //5 Have 3 parameters
        System.out.println(a + b + c);
    }
}
