/*


A descriptive sentence of what this file does.

This files takes a string input (P,N,D,Q,H,G) and converts it to the appropriate dollar (cents) amount (.01, .05, .10, .25, .50, 1.00)
and then udpates the overall machine coin balance.

Additinally in V2 this file will continually ask the user for a coin, add that to the balance, print the users balance to the console, and continue
adding coins until the blance exceeds $3.00 OR the user presses V to exit the coin calculator.

At the end it will update the final balance. 

@author John Nelson
@collaborator Victoria Fabrizio



*/
import java.util.*;

public class vendingreciever {
	public static void main(String[] args) {
		double balance = 0; //machine's balance
		Scanner in = new Scanner(System.in);

		// initialize coins to default variable to start loop		
		String coins = "";
		boolean endFlag = true;

		// while loop to test if balance exceeds 3.00 or the user presses V to stop

		while (balance <= 3.00 && endFlag) { 
		
			System.out.print("\nPlease enter a coin :>");
			coins = in.nextLine().toUpperCase(); //get type from user

			// switch used to test each case for coins (P/N/D/Q/H/G) and add appropriate value for each case 
			
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
			case "V":
				endFlag = false;
				break;
			default:
				break;
			}
			// print out current (subtotal) balance in coin machine

			System.out.printf("\nYour balance is $%.2f", balance);	
		}

		// print out final balance of coin machine
		System.out.printf("\nYour final balance is $%.2f", balance);


		

	}

}
