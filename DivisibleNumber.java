package ifelse.problems;

import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0)
			System.out.println("Number is divisible by 3 & 5 both ");
		
		else if (num % 5 == 0)
			System.out.println(num + " is divisible by 5 ");
		
		else if (num % 3 == 0)
			System.out.println(num + " is divisible by 3 ");
		
		else
			System.out.println(num + " is not divisible by 3 & 5");

	}
}
