package JavaOOPsConceptsAndBasics;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings gr = new Greetings();
        gr.m1();

        String s = gr.m2();
        System.out.println(s); //Syste.out.println(gr.m2());

        gr.m3("John");

        String n = gr.m4("David");
        System.out.println(n);
    }
}
