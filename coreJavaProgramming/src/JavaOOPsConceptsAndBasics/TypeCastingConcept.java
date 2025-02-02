package JavaOOPsConceptsAndBasics;

//Upcasting - converting the value from smaller to higher
//Ex:- int to long . float to double
//Upcasting is an automatic process - implicit process

//Down casting - converting the value from higher to smaller
//Ex:- long to int , double to float
//Down casting is a non-automatic process - explicit process
//Possibility of loosing or truncating of data/value

public class TypeCastingConcept {
    public static void main(String[] args) {

        //upcasting - automatic process
        int intValue = 100;
        long longValue = intValue;
        System.out.println(longValue);

        float floatValue = 10.5f;
        double doubleValue = floatValue;
        System.out.println(doubleValue);

        //Down casting - Non-automatic process
        long longValue1 = 10000;
        int intValue1 = (int) longValue1;
        System.out.println(intValue1);

        double doubleValue1 = 125.55;
        float floatValue1 = (float) doubleValue1;
        System.out.println(floatValue1);

        int i =100;
        double d=i;
        System.out.println(d); // Up casting

        double d1 = 10.5;
        int i1 = (int) d1;
        System.out.println(i1); // Down casting

    }
}
