package Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 70, 5, 50 };
		int smallestNum = a[0];
		for (int num : a) {
			if (num < smallestNum)
				smallestNum = num;
		}
		System.out.println("smallest element in the array is:" + smallestNum);
	}

}
