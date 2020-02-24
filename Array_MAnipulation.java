package Practice;

import java.util.Scanner;

public class Array_MAnipulation {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int m = s.nextInt();
		long arr[] = takeinput(n);
		long arr2D[][] = takeinput2D(m, 3);
		manipulator(arr, arr2D,m);


	}

	public static void manipulator(long[] a1, long[][] a2,int m) {
		for (int i = 0; i < m; i++) {
			for (int a =(int) (a2[i][0]-1); a <= a2[i][1]-1; a++) {
				a1[a] += a2[i][2];

			}

		}
		System.out.println(max(a1));

	}

	public static long[][] takeinput2D(int row, int col) {// System.out.println("Enter no of Rows--");
//		int row=s.nextInt();
//		int col=s.nextInt();

		long[][] arr = new long[row][col];
		for (row = 0; row < arr.length; row++) {// System.out.println("Enter number of columns--");
			for (col = 0; col < arr[row].length; col++) {// System.out.println("["+row+"-"+col+"]");
				arr[row][col] = s.nextLong();
			}
		}
		return arr;
	}


	
	public static long max(long[] arr) {
		long max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}
	public static long[] takeinput(int n) {
//		System.out.println("enter size");
//		int n = s.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

}
