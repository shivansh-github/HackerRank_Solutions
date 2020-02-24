package Practice;

import java.util.Scanner;

public class KNIghtsCount {

	static int count = 0;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println("\n" + qcomb2d(new boolean[n][n], 0, 0, n, 0, ""));
	}

	public static int qcomb2d(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			count++;

			System.out.print(ans + " ");
			return count;
		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;

		}

		if (row == board.length) {
			return count;

		}
		boolean a = check(board, row, col);

		if (a) {
			board[row][col] = true;
			qcomb2d(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		qcomb2d(board, row, col + 1, tq, qpsf, ans); /// no waali call
		return count;
	}

	public static boolean check(boolean[][] board, int row, int col) {//// check vertically upwards

		int c = col - 2;
		int r = row - 1;

		if (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;

			}

		}
		/// checking of row;

		r = row - 2;
		c = col - 1;
		if (c >= 0 && r >= 0) {
			if (board[r][c] == true) {
				return false;
			}

		}

		/// checking diagonally left
		r = row - 2;
		c = col + 1;

		if (r >= 0 && c < board[0].length) {

			if (board[r][c] == true) {
				return false;
			}

		}
		//// checking right diagonal
		r = row - 1;
		c = col + 2;
		if (r >= 0 && c < board[0].length) {

			if (board[r][c] == true) {
				return false;
			}

		}

		return true;

	}

}
