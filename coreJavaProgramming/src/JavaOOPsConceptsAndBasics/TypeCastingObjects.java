package JavaOOPsConceptsAndBasics;

class Parent1{
    String name = "John";

    void m1(){
        System.out.println("this is m1 from parent...");
    }
}

class ChildA extends Parent1{
    int id=101;

    void m2(){
        System.out.println("this is m2 from child...");
    }
}


public class TypeCastingObjects {
    public static void main(String[] args) {
        ChildA c = new ChildA();
        System.out.println(c.name); //Parent1
        c.m1(); //Parent1
        System.out.println(c.id); //ChildA
        c.m2(); //ChildA

        Parent1 p = new ChildA(); // Upcasting
        System.out.println(p.name); //Parent1
        p.m1(); //Parent1
        //System.out.println(p.id); //ChildA - compilation error, we cannot access
        //p.m2(); //ChildA - compilation error, we cannot access

        Parent1 p1 = new Parent1();
        ChildA c1 = (ChildA) p1; // Down casting - ClassCastException - reduce parent into child
        System.out.println(c1.name);
        System.out.println(c1.id);
        c1.m1();
        c1.m2();


    }
}
