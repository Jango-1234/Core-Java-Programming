package Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// Declaring an Array
		// Approach1
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		//Approach2
		int a1[][] = { {100,200}, {300,400}, {500,600} };
		
		//length of an array
		System.out.println("length of rows:"+a.length); //length of rows:3
		System.out.println("length of columns:"+a[0].length); //length of columns:2	
		
		//Read single value from an array
		System.out.println("Reading a single value:" +a[2][1]); //Reading a single value: 600
		
		//Read multiple values from an array using Nested traditional for loops
		for(int r=0;r<=a[r].length-1;r++) {
			for(int c=0;c<=a[c].length-1.;c++) {
				System.out.print(a[r][c]+"  ");	
			}
			System.out.println();
		}
		/*
		 * 100 200 300 400
		 */
		
		//Read multiple values using enhanced for loop
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		/*
		 * Notes for above for above for each loop:- 
		 * Outer Loop:
		 * for(int arr[]:a): This loop iterates over each row of the 2D array a. 
		 * int arr[]: In each iteration, arr is assigned to a single row of the array. So,
		 * in the first iteration, arr will be [100, 200], in the second iteration, it
		 * will be [300, 400], and so on. 
		 * 
		 * Inner Loop: 
		 * for(int x:arr): This loop iterates over each element within the current row
		 * (arr). int x: In each iteration, x is assigned to the current element of the
		 * row. 
		 * 
		 * Output:-
		 * 100 200 300 400 500 600
		 */

	}

}
