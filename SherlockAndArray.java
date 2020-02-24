package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndArray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = takeinput(n);
		calc(arr);

	}

	public static void calc(int arr[]) {

		Arrays.sort(arr);
		int ltsum = 0;
		int rtsum = 0;

		int rtidx = arr.length;
		int ltidx = 0;
		int mid =(rtidx+ltidx)/2;

		for (int i = ltidx; i < mid; i++) {
			ltsum += arr[i];

		}

		for (int i = mid + 1; i < rtidx; i++) {
			rtsum += arr[i];
		}

		while (mid >= 0 && mid < arr.length) {
			if (ltsum == rtsum) {
				System.out.println("YES");
				return;
			}

			else if (ltsum < rtsum) {
				mid++;
			}

			else {
				mid--;
			}
		}
		System.out.println("NO");
		
	}

	public static int[] takeinput(int n) {
//		System.out.println("enter size");
//		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
