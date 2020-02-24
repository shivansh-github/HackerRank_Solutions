package Practice;

import java.util.Scanner;

public class KAngaroo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int v1 = s.nextInt();
		int x2 = s.nextInt();
		int v2 = s.nextInt();

//		int jump1 = 0;
//		int jump2 = 0;
//
//		int sum1 = x1;
//		int sum2 = x2;

		if (x1 == x2 && v1 == v2) {
			System.out.println("YES");
		} else if (x1 == x2 && v1 > v2) {
			System.out.println("NO");
		} else if (x1 <= x2 && v1 <= v2) {
			System.out.println("NO");
		} else {
			int x = (x2 - x1) % (v1 - v2);

			if (x == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}
	}

}
