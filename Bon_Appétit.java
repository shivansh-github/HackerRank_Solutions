package Practice;

import java.util.Scanner;

public class Bon_Appétit {
	 static Scanner scn=new Scanner(System.in);

	
public static void main(String[] args) {
	int n=scn.nextInt();
	int k=scn.nextInt();
	int bill[]=takeinput(n);
	int b=scn.nextInt();
	int ba;
//	int bt;
	int i=0;
	int sum=0;
	while(i<n)
	{
		if(i!=k)
		{sum+=bill[i];}
		i++;
	}
	ba=sum/2;
	
	if(b==ba)
	{
		System.out.println("Bon Appetit");
	}
	
	else 
	{
		System.out.println(b-ba);
	}
	
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
