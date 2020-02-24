package Practice;

import java.util.Scanner;

public class The_Hurdle {
	 static Scanner scn=new Scanner(System.in);

	
	public static void main(String[] args) {
		
		int n=scn.nextInt();
		int k=scn.nextInt();
		int arr[]=takeinput(n);
		
		int max=max(arr);
		if(max>k)
		{
			System.out.println(max-k);
		}
		
		else {
			System.out.println(0);
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
	
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}
}
