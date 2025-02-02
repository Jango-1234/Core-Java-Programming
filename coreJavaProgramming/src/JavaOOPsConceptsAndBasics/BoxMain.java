package JavaOOPsConceptsAndBasics;

public class BoxMain {
    public static void main(String[] args) {
        Box b = new Box(); //1
        System.out.println(b.volume());

        Box b1 = new Box(10.5, 15.5, 5.0); //2
        System.out.println(b1.volume());

        Box b2 = new Box(10.5); //3
        System.out.println(b2.volume());
    }
}
