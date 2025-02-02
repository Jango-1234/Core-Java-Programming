package JavaOOPsConceptsAndBasics;

public class ThisKeyword {
    int x, y; //class or instance variables

    //Constructor
    ThisKeyword(int x, int y) { //Here x and y are local variables
        this.x = x;
        this.y = y;
    }

    //Method
    /* void setData(int x, int y){
        this.x=x;
        this.y=y;
    }*/

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword(100, 200);
        /* ThisKeyword th = new ThisKeyword();
        th.setData(10,20);*/
        th.display();
    }
}
