import java.util.*;
import java.lang.*;

public class BankAccount {
	private double totalAmount;
	public BankAccount(double initAmount) {
		totalAmount = initAmount;
	}

	public void deposit(double amount) {
		totalAmount += amount;
	}

	public void withdraw(double amount) {
		totalAmount -= amount;
	}

	public double getAmount() {
		return totalAmount;
	}
}
