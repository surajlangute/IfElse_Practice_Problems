package ifelse.problems;

import java.util.Scanner;

public class BalanceWithdraw {

	public static void main(String[] args) {
		int pin = 5555;
		double balance = 25000;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pin : ");
		int userPin = scan.nextInt();
		
		if (pin == userPin) {
			System.out.println("Enter withrawal amount");
			double userAmount = scan.nextDouble();
			
			if (userAmount <= balance && userAmount>0) {
				double finalBalance = (balance - userAmount);
				System.out.println("Final balance is : " + finalBalance);
			} 
			else if (userAmount <0)
				System.out.println("Invalid Amount");
			else {
				System.out.println("Insufficient Balance");
			}
		} else
			System.out.println("Invalid pin ");
	}

}
