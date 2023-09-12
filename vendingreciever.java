/*
You are to write simple coin-receiver for a soda
vending machine. Here are the specifications:
1. Now that you learned about commenting in Section 4.9 of the textbook, all
programs submitted going forward should have a heading of the following
format:

A descriptive sentence of what this file does.
@author your_name_here
@collaborator any_partner_you_worked_with


2. The program should set up an empty variable for the amount of money placed
in the machine by the user. (Initially, none.)
3. The program should prompt "Please enter a coin :>".
4. The program should then accept any of the following letters: P (penny), N
(nickel), D (dime), Q (quarter), H (half dollar), G (golden dollar coin). The
machine should accept input of either case (i.e., upper or lower).
5. The program should update the machine's balance with what was entered by
the user.
6. The program should print: "Your balance is []." The [] should be replaced by a
properly formatted $ amount using decimals.
7. Only one coin is to be dropped in at this point.
8. This is revision one of the program.
9. Also generate the Javadoc for this version of the program.
10. Push the source code and documentation to your Github repository.
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
