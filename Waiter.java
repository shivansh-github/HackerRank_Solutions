package Practice;

import java.util.Scanner;
import java.util.Stack;

public class Waiter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();

		Stack<Integer> A = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			A.push(s.nextInt());
		}
		int prime = 2;

		for (int i = 0; i < q; i++) {
			Stack<Integer> B = new Stack<Integer>();
			Stack<Integer> na = new Stack<Integer>();

			while (!A.empty()) {
				int num = A.pop();
				if (num % prime == 0) {
					B.push(num);

				} else {
					na.push(num);

				}
			}

			display(B);
			A = na;
			prime = nextPrime(prime);
		}
		display(A);

	}

	public static void display(Stack<Integer> p) {
		while (!p.isEmpty()) {
			System.out.println(p.pop());
		}
	}

	static int nextPrime(int begin) {
		for (int i = begin + 1;; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {       // i*i for decreasing number of computation
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}