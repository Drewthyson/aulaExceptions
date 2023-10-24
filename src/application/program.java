package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BalanceOutOfBound;
import model.exceptions.WithdrawOutOfBound;

public class program {

	public static void main(String[] args) {
		
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("New balance: " + account.getBalance());
		
			sc.close();
		}
		catch (WithdrawOutOfBound e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (BalanceOutOfBound e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
	}

}
