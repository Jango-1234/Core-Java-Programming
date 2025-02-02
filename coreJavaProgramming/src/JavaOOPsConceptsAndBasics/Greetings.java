package JavaOOPsConceptsAndBasics;

public class Greetings {
    //No params,no return value
    void m1(){
        System.out.println("Hello...");
    }

    //No params,return value
    String m2(){
        return ("Hello how are you??");
    }

    //Takes param,no return value
    void m3(String name){
        System.out.println("Hello "+name);
    }

    //Takes param,return value
    String m4(String name){
        return ("Hello "+name);
    }
}
