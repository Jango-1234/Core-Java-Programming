package Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 70, 40, 50 };
		int largestNum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largestNum)
				largestNum = a[i];
		}
		System.out.println("Largest element is:" + largestNum);
	}

}
