package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n=s.nextInt();
		
		long arr[]=takeinput(n);
		Arrays.sort(arr);
		
		for(long val:arr)
		{
			System.out.println(val);
		}
	}

	

	public static long[] takeinput(int n) {
//		System.out.println("enter size");
//		int n = s.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
