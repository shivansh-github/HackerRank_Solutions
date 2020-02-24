package Practice;

import java.util.Scanner;

public class GradingStudents {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = takeinput();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 38) {
				System.out.println(arr[i]);
			} else {
				int n = arr[i] % 5;
				int nn = 5 - n;
				if (nn < 3) {
					System.out.println(arr[i] + nn);

				} else {
					System.out.println(arr[i]);
				}

			}

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
