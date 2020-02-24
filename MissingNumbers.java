package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int[] arr = takeinput(n);

		int m = s.nextInt();
		int[] brr = takeinput(m);
		Arrays.sort(arr);
		Arrays.sort(brr);

		for (int i = 0; i < arr.length;) {
			for (int j = 0; j < brr.length;) {
				if (arr[i] == brr[j]) {
					i++;
					j++;
				}

				else {
//					if (j >= 1) {
					if (brr[j] != brr[j - 1])
						{	System.out.print(brr[j] + " ");
					                                       }
					j++;

				}

			}
		}

	}

	public static int[] takeinput(int n) {
		// System.out.println("enter size");
		// int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
