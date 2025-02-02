package JavaPrograms;

public class SwappingWithoutUsingThirdVar {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		//with using temp/3rd variable t
	/*	int t;
		t=x; //5
		x=y; //10
		x=t; //5  */
		
		//without using temp/3rd variable , using + operater
		x=x+y; //15
		y=x-y; //5
		x=x-y; //10 
		
		//without using temp/3rd variable using * and / operater
/*		x=x*y; //50
		y=x/y; //5
		x=x/y; //10           */
		
		//using XOR (covert decimal to binary)
/*		x=x^y; //15 --> 1111
		y=x^y; //10 -->1010
		x=x^y; //5 --> 0101		*/
		
		System.out.println(x);
		System.out.println(y);
	}

}
