import java.util.*;
import java.lang.*;


public class Rerol_HW1 {

	public static void main(String[] args) {
		String username = "Nur";
		String pass = "hello";
		String enteredUsername;
		String enteredPass;
		int userPreference;
		int userDeposit;
		int userWithdraw;

		boolean passAndUser = false;

		Scanner scan = new Scanner(System.in);
		while (passAndUser == false) {
			System.out.print("Enter a username: \n");
			enteredUsername = scan.nextLine();

			System.out.print("Enter a pass: \n");
			enteredPass	= scan.nextLine();

			if (enteredUsername.equals(username) && enteredPass.equals(pass)) {

				BankAccount balance = new BankAccount(100.0);
				boolean session = true;
				char sessionProcess;

				while (session == true) {

					System.out.println("Please selecet the options: ");
					System.out.println("1. Check the balance\n2. Deposit\n3. Withdraw");

					userPreference = scan.nextInt();

					if (userPreference == 1) {
						System.out.print("The balance on your account is: $"+balance.getAmount());
						
					}
					else if (userPreference == 2) {
						System.out.print("How much you want to deposit? ");

						userDeposit = scan.nextInt();
						balance.deposit((double) userDeposit);

						System.out.println("The total amount now is " + balance.getAmount());

					 }
					else if (userPreference == 3) {
						System.out.print("How much you want to withdraw? ");

						userWithdraw = scan.nextInt();
						balance.withdraw(userWithdraw);

						System.out.println("The balance now is: " + balance.getAmount());
					}
					else {
						System.out.println("Sorry, I did not get that.");
						continue;
					}

					System.out.print("Do you want to continue the session? (y/n)");

						sessionProcess = (char) System.in.read();

						if (sessionProcess == 'n') {
							System.out.print("Cheers!")
							return;
						}
				}
			}
			else
				System.out.println("The username and password are not correct!\n");
		}
		
	}

}
