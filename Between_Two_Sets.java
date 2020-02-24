package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Between_Two_Sets {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int m = s.nextInt();

		int a[] = takeinput(n);
		int b[] = takeinput(m);
		int ctr = 0;

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = a[0]; i <= b[b.length - 1]; i++) {

			if (isvalid(n, m, a, b, i)) {
				ctr++;
			}
		}

		System.out.println(ctr);

	}

	public static boolean isvalid(int n, int m, int a[], int b[], int i) {
		for (int j = 0; j < n; j++) {
			if (i % a[j] != 0) {

				return false;

			}

		}
		for (int x = 0; x < m; x++) {

			if (b[x] % i != 0) {

				return false;
			}
		}
		return true;
	}

	public static int[] takeinput(int n) {
		// System.out.println("enter size");
//		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
