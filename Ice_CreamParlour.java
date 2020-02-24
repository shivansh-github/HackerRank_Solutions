package Practice;

import java.util.Scanner;

public class Ice_CreamParlour {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int not = s.nextInt();
		for (int a = 0; a < not; a++) {
			int ser = s.nextInt();
			int n = s.nextInt();
			int arr[] = takeinput(n);
			// int sum = 0;
			// int n = 0;
			for (int i = 0; i < arr.length; i++) {
				int j = i + 1;
				while (j < arr.length) {
					if ((arr[i] + arr[j] == ser)) {

						System.out.println((i+1)+" "+(j+1));
						break;

					} else {
						j++;
					}
				}
			}
		}
	}

	public static int[] takeinput(int n) {
		// System.out.println("enter size");
//		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}