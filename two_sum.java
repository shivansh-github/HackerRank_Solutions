package Practice;

import java.util.Scanner;

public class two_sum {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeinput();
		finder(arr);

	}

	public static void finder(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i]+" ");

		}

	}

	public static int[] takeinput() {
		// System.out.println("enter size");
	 int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
