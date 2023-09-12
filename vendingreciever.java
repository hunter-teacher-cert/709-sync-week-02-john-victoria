/*


A descriptive sentence of what this file does.

This files takes a string input (P,N,D,Q,H,G) and converts it to the appropriate dollar (cents) amount (.01, .05, .10, .25, .50, 1.00)
and then udpates the overall machine coin balance.

@author Victoria Fabrizio
@collaborator John Nelson


*/
import java.util.*;

public class vendingreciever {
	public static void main(String[] args) {
		double balance = 0; //machine's balance
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a coin :>");
		String coins = in.nextLine().toUpperCase(); //get type from user


		switch(coins) {
		case "P":
			balance += 0.01;
			break;
		case "N": 
			balance += 0.05;
			break;
		case "D":
			balance += 0.10;
			break;
		case "Q": 
			balance += 0.25;
			break;
		case "H":
			balance += 0.50;
			break;
		case "G":
			balance += 1;
			break;
		}

		System.out.printf("Your balance is $%.2f", balance);

	}

}
