package ifelse.problems;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter buying price ");
		double buyingPrice = scan.nextDouble();
		
		System.out.println("Enter selling price ");
		double sellingPrice = scan.nextDouble();
		
		if (buyingPrice < sellingPrice) {
			double profit = ((sellingPrice - buyingPrice) / buyingPrice) * 100;
			System.out.println("profit is  " + profit +" %");
		} else {
			double loss = ((buyingPrice - sellingPrice) / buyingPrice) * 100;
			System.out.println("Loss is  " + loss + " %");

		}
	}
}