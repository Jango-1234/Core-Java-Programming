package JavaOOPsConceptsAndBasics;


public class DataConversionMethods {
    public static void main(String[] args) {
        // 1. String ---> it,double, boolean
        //String ---> int
        String s = "welcome";
        //int sint = Integer.parseInt(s); --> NumberFormatException
        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        //String ---> double
        String s3 = "10.5";
        String s4 = "20.0";
        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

        //String ---> boolean
        String s5 = "true"; // othr than true, if you pass any string that will return false
        System.out.println(s5);

        // 2. int, double, boolean ---> String
        int a = 10;
        double b = 10.5;
        char c = 'A';
        boolean d = true;
        String s6 = String.valueOf(a);
        System.out.println(s6);
        String s7 = String.valueOf(b);
        System.out.println(s7);
        String s8 = String.valueOf(c);
        System.out.println(s8);
        String s9 = String.valueOf(d);
        System.out.println(s9);


    }

}
