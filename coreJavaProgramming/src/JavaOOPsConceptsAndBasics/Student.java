package JavaOOPsConceptsAndBasics;

public class Student {
    int sid;
    String sname;
    char grade;

    void printStudentData(){
        System.out.println(sid+"  "+sname+"  "+grade);
    }

    //Method
    void setStudentPrintData(int id,String name,char gr){
        sid=id;
        sname=name;
        grade=gr;
    }

    //Consructor
    Student(int id,String name,char gr){
        sid=id;
        sname=name;
        grade=gr;
    }
}
