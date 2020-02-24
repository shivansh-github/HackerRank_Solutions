package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Socks_Merchant {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = takeinput(n);
		Arrays.sort(arr);
		int total = 0;

		for (int i = 0; i < n; i++) {
			if (i<n-1 && arr[i] == arr[i + 1]  ) {
				i++;
				total++;
			}
		}

		System.out.println(total);
	}

	public static int[] takeinput(int n) {
		// System.out.println("enter size");
//		 int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
