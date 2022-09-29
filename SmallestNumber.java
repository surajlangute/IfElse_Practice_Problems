package ifelse.problems;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 < num2 && num1 < num3) 
			System.out.println(num1 + " is smaller  ");
		 else if (num2 < num3) 
			System.out.println(num2 + " is smaller ");
		 else
			System.out.println(num3 + " is smaller ");
		
	}

}
