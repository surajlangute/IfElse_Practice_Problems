package ifelse.problems;

import java.util.Scanner;

public class DigitShow {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int digit = scan.nextInt();
		
		if (digit <=9 && digit > 0) 
			System.out.println("Its a Single Digit Number .");

		
		else if (digit > 9 && digit < 100)
			System.out.println("Its a Two Digit Number .");
		
		else if (digit > 99 && digit < 1000)
			System.out.println("Its a Three Digit Number .");
		
		else
			System.out.println("Digit is more than Three digit .....");
	}

}
