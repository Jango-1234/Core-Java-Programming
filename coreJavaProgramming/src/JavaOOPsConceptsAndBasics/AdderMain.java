package JavaOOPsConceptsAndBasics;

public class AdderMain {
    public static void main(String[] args) {
        Adder addObj = new Adder();
        addObj.sum(); //1
        addObj.sum(100, 200); //2
        addObj.sum(10.5, 20); //3
        addObj.sum(10, 20.5); //4
        addObj.sum(10, 20, 30);//5

    }

}
