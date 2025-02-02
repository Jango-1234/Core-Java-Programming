package Arrays;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		//using for each loop
	  /* for (int num : a) {
			sum += num;
		}  */
		System.out.println("Sum of elements in array is:" + sum);
	}

}
