package JavaOOPsConceptsAndBasics;

public class ConstructorDemo {
    int x,y;

    //Default constructor
    ConstructorDemo(){
        x=100;
        y=200;
    }

    //Parameterized constructor
    ConstructorDemo(int a,int b){
        x=a;
        y=b;
    }

    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo(); //invoke default constructor
        cd.sum();

        ConstructorDemo cd1 = new ConstructorDemo(10,20);
        cd1.sum();
    }
}
