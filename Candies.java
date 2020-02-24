package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		long sum = 0;
		int n = scn.nextInt();
		int arr[] = takeinput(n);
		int c[] = new int[n];
		Arrays.fill(c, 1);

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				c[i] = c[i - 1] + 1;
			}
		}

		for (int i = n - 2; i >= 0; i--)

		{
			if (arr[i] > arr[i + 1]) {
				c[i] = Math.max(c[i + 1] + 1, c[i]);

			}

		}

		for (int i = 0; i < n; i++) {
			sum += (long) c[i];
		}
		System.out.println(sum);
	}

	public static int[] takeinput(int n) {
		// System.out.println("enter size");
//	 int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
}
