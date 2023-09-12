/*
This file takes command line argument of the number of cents and the program outputs the correct number of coins
@author: Victoria Fabrizio
@collaborator: John Nelson 
*/

public class vendingcents {
	public static void main(String[] args) {
		int balance = (int) args[0];

		int totalDollar = 0;
		int totalHalf = 0;
		int totalQuarter = 0;
		int totalDime = 0;
		int totalNickel = 0;
		int totalPenny = 0;

		//get dollar amount
		totalDollar = balance % 100;
		balance -= totalDollar*100;

		//get half dollar amount
		totalDollar = balance % 50;
		balance -= totalDollar*50;

		//get quarter amount
		totalDollar = balance % 25;
		balance -= totalDollar*25;

		//get dime amount
		totalDollar = balance % 10;
		balance -= totalDollar*10;

		//get nickel amount
		totalDollar = balance % 5;
		balance -= totalDollar*5;

		//get penny amount
		totalDollar = balance % 1;
		balance -= totalDollar*1;

		//output
		System.out.println("You will have " + totalDollar + " golden dollar coins, " + totalHalf + " half dollar coins, " + totalQuarter + " quarters, " + totalDime + " dimes, " + totalNickel + " nickels, " + totalPenny + " pennies.");


	}
}
