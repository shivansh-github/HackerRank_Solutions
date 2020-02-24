package Practice;

import java.util.Scanner;

public class Dayofprogramer {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int y = s.nextInt();
		if(y==1918)
		{
			System.out.println("26.09.1918");
		}

		else
		{
			boolean x=true;

		 if (y > 1918) {
			x = gleapyear(y);
		}  
		
		else if(y<1918)
		{
			x = jleapyear(y);
		}
		
		if (x) {
			System.out.println("12.09." + y);
		} else {
			System.out.println("13.09." + y);
		}
	}}

	public static boolean gleapyear(int y) {

		if (y % 400 == 0) {
			return true;
		} else if (y % 100 == 0) {
			return false;
		} else if (y % 4 == 0) {
			return true;
		}
		return false;
	}

	public static boolean jleapyear(int y) {
		if (y % 4 == 0) {
			return true;
		}
		return false;
	}
}
