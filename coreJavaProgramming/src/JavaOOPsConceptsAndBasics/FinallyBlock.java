package JavaOOPsConceptsAndBasics;

public class FinallyBlock {
    public static void main(String[] args) {
        //Finally block is optional unlike catch block which is mandatory when try block is used
        //Finally block will be executed irrespective of exception is thrown

        //String s = null;
        //case1: Exception occured, catch block handled ---> finally block will execute
        /*try {
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println("Catch block handled exception..");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("you entered into finally block...");
        }
        System.out.println("Program finished...");
    }*/

        //case2: Exception occured, catch block NOT handled ---> finally block will execute

    /*try {
        System.out.println(s.length());

    } catch (NumberFormatException e) {
        System.out.println("Catch block handled exception..");
        System.out.println(e.getMessage());
    } finally {
        System.out.println("you entered into finally block...");
    }
        System.out.println("Program finished...");
}*/
        //case3: Exception does not occured, catch block ignored ---> finally block will execute
        String s = "welcome";
        try {
            System.out.println(s.length());

        } catch (NumberFormatException e) {
            System.out.println("Catch block handled exception..");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("you entered into finally block...");
        }
        System.out.println("Program finished...");
    }
}
