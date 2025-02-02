package JavaOOPsConceptsAndBasics;

public class AcountMain {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccno(101);
        acc.setName("John");
        acc.setAmount(10000);
        System.out.println(acc.getAccno());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
