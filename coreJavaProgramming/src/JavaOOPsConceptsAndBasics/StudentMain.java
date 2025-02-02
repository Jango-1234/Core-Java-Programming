package JavaOOPsConceptsAndBasics;

public class StudentMain {
    public static void main(String[] args) {
      /*  Student stu1 = new Student();
        //using object reference variables
        stu1.sid = 101;
        stu1.sname = "Smith";
        stu1.grade = 'A';
        stu1.printStudentData();

        Student stu2 = new Student();
        stu2.sid = 102;
        stu2.sname = "John";
        stu2.grade = 'A';
        stu2.printStudentData();

        //using method
        stu1.setStudentPrintData(103,"David",'A');
        stu1.printStudentData();*/

        //using constructor
        Student stu = new Student(101, "Sam", 'A');
        stu.printStudentData();
    }
}
