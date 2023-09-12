/*
This file takes command line argument of the number of cents and the program outputs the correct number of coins
@author: Victoria Fabrizio
@collaborator: John Nelson 
*/

public class vendingcents {
	public static void main(String[] args) {
		int balance = Integer.parseInt (args[0]);
		System.out.println("hello " + balance);
		int totalDollar = 0;
		int totalHalf = 0;
		int totalQuarter = 0;
		int totalDime = 0;
		int totalNickel = 0;
		int totalPenny = 0;

		//get dollar amount
		
		totalDollar = balance / 100;
		balance -= totalDollar*100;

		//get half dollar amount
		totalHalf = balance / 50;
		balance -= totalHalf*50;

		//get quarter amount
		totalQuarter = balance / 25;
		balance -= totalQuarter*25;

		//get dime amount
		totalDime = balance / 10;
		balance -= totalDime*10;

		//get nickel amount
		totalNickel = balance / 5;
		balance -= totalNickel*5;

		//get penny amount
		totalPenny = balance / 1;
		balance -= totalPenny*1;

		//output
		//System.out.println("Test1");
		System.out.println("You will have " + totalDollar + " golden dollar coins, " + totalHalf + " half dollar coins, " + totalQuarter + " quarters, " + totalDime + " dimes, " + totalNickel + " nickels, " + totalPenny + " pennies.");
		//System.out.println("Test 2");

	}
}
