package JavaOOPsConceptsAndBasics;

public class PassingParamsToMainMethod {
    public static void main(String[] args) {
        //Passing parameters to the main method
        //we are passing the arguments in Run configuration - Program arguments
        System.out.println(args.length);
        for (String value : args) {
            System.out.println(value);
        }
    }
}
