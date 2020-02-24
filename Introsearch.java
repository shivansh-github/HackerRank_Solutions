package Practice;

import java.util.Scanner;

public class Introsearch {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int val = s.nextInt();
		int n = s.nextInt();
		int arr[]=takeinput(n);
		binarysearch(arr, val);

	}

	
	public static void binarysearch(int []arr,int val)
	{
		
		int first=0;
		int last=arr.length-1;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			
			if(arr[mid]==val)
			{
				System.out.println(mid);
				return;
			}
			else if(arr[mid]>val)
			{
				last=mid-1;
			}
			else
			{
				first=mid+1;
			}

			
		}
		
	}
	
	public static int[] takeinput(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
return arr;
	}
}
