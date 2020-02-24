package Practice;

import java.util.Scanner;

public class Angryprofessor {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int not = scn.nextInt();
		for (int x = 0; x < not; x++) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int arr[] = takeinput(n);
			int entry = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] <= 0) {
					entry++;

				}

			}
			if (entry >= k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
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
