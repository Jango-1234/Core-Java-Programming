package JavaPrograms;

public class FactorialNumber {
	//fact of 3= 3*2*1 =6
	//fact of 10=10*9*8*7...*1
	//fact of 1 =1
	//fact f 0 = 1	
	
	//1. Without using reccursive - use for loop
	public static int factorial(int num) { //3
		int fact=1;
		for (int i = 1; i <= num; i++) { //1<=3 , 2<=3 ,3<=3
			fact = fact*i; //1*1=1 , 1*2=2 , 2*3=6
		}
		return fact; //1 , 2 , 6
	}
	
	//2. With reccursive fuction: A function calling itself
	public static int fact(int num) { //3
		if(num==0) //3>0
			return 1;
		else
			return (num * fact(num-1)); //3*fact(2) = 3*2 = 6
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		System.out.println(factorial(5));
		
		System.out.println(fact(3));
		System.out.println(fact(10));
		System.out.println(fact(1));
		System.out.println(fact(0));
	}

}
