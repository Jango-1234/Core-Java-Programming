package JavaOOPsConceptsAndBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException { //using throws keyword
        System.out.println("program started..");
        System.out.println("program in progress..");

        FileInputStream fis = new FileInputStream("C:\\TEXT.TXT");

        //using try catch blocks
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println("program finished...");
        System.out.println("program exited...");
    }
}
