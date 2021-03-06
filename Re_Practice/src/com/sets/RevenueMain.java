package com.sets;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class RevenueMain {

	public static void main(String[] args) {
		TreeSet<Revenue> set = new TreeSet<>();
		String string = "";
		String revCategory = "";
		int amount = 0;

		Revenue revenue = new Revenue(revCategory, amount);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Enter revenue Category");
			revCategory = scanner.nextLine();

			if (revCategory.equalsIgnoreCase("Sponsorship")) {
				System.out.println("Enter revenue amount");
				int spAmount = Integer.parseInt(scanner.nextLine());
				
			} else if (revCategory.equalsIgnoreCase("Media rights")) {
				System.out.println("Enter revenue amount");
				int mediaAmount = Integer.parseInt(scanner.nextLine());
				
			} else if (revCategory.equalsIgnoreCase("Ticket sales")) {
				System.out.println("Enter revenue amount");
				int ticketAmount = Integer.parseInt(scanner.nextLine());
				
			} else if (revCategory.equalsIgnoreCase("Stall rental")) {
				System.out.println("Enter revenue amount");
				int stallAmount = Integer.parseInt(scanner.nextLine());
				
			} else if (revCategory.equalsIgnoreCase("Prize money")) {
				System.out.println("Enter revenue amount");
				int prizeAmount = Integer.parseInt(scanner.nextLine());
				
			}

			else {
				System.out.println("Invalid Output");
			}
			System.out.println("Do you want to continue(yes/no):");
			string = scanner.nextLine();

		}

		while (string.equalsIgnoreCase("yes"));

		
		
		
		if (string.equalsIgnoreCase("no")) {

			Iterator<Revenue> iterator = set.iterator();
			while (iterator.hasNext()) {
				Revenue revenue2 = iterator.next();
				System.out.println(revenue2.getRevenueCategory() + " " + revenue2.getAmount());

			}
			
			int totalAmt = amount;
			for (Revenue revenue3 : set) {
				totalAmt = totalAmt + revenue3.getAmount();
			}
			System.out.println("Total amount earned: " + totalAmt);
		}

	}
}