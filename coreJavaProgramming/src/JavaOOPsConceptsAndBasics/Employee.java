package JavaOOPsConceptsAndBasics;

public class Employee {
    //Variables
    int eid;
    String ename;
    String job;
    int sal;

    //Methods
    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.eid = 101;
        emp1.ename = "John";
        emp1.job = "Manager";
        emp1.sal = 50000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.eid = 103;
        emp2.ename = "David";
        emp2.job = "SeniorManager";
        emp2.sal = 100000;
        emp2.display();
    }
}
