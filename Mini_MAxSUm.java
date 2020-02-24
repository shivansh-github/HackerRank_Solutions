package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_MAxSUm {

	static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	long arr[]=takeinput();
	Arrays.sort(arr);
	long minsum=arr[0]+arr[1]+arr[2]+arr[3];
	long maxsum=arr[1]+arr[2]+arr[3]+arr[4];
	System.out.println(minsum+" "+maxsum);
	
}
	




public static long[] takeinput() {
	// System.out.println("enter size");
 int n = 5;
	long arr[] = new long[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = s.nextInt();
	}
	return arr;
}

}