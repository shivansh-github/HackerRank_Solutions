package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Larger_Factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		BigInteger fact = BigInteger.ONE;
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));

		}
	
	
	System.out.println(fact);
	
	
	}
	

}
