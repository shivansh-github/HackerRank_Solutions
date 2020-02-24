package Practice;

import java.util.Scanner;

public class Birthday_Chocolate {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int arr[] = takeinput(n);
		int d = s.nextInt();
		int m = s.nextInt();
		int sum = 0;
		int ways = 0;

		if (m <= arr.length)
			{for (int i = 0; i < m; i++)
				{sum += arr[i];}

		if (sum == d)
			ways++;}

		

		System.out.println(ways);

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
