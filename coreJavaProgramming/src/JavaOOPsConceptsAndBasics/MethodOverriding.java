package JavaOOPsConceptsAndBasics;

class Bank { //Parent class
    double roi() {
        return 0;
    }
}

class ICICI extends Bank { //child class1
    double roi() {
        return 10.5;
    }
}

class SBI extends Bank { //child class2
    double roi() {
        return 11.5;
    }
}

public abstract class MethodOverriding {
    public static void main(String[] args) {
        ICICI ic = new ICICI();
        System.out.println(ic.roi());

        SBI sb = new SBI();
        System.out.println(sb.roi());
    }

    abstract void draw();
}
