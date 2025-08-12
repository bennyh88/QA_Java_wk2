package lab10b;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account account = new Account(1, 100.00, "me");
//		
//		System.out.println(account.getDetails());
//		
//		account.withdraw(50);
//		
//		System.out.println(account.getDetails());
//		
//		try {
//			account.withdraw(60);
//		} 
//		catch (IllegalArgumentException e) {
//			System.out.println("Withdrawl amount exceeds account balance");
//		}
//		finally {
//			account.close();
//		}
//		
//		System.out.println(account.getDetails());
		
		
		ArrayList<Account> accounts = new ArrayList<>( );
		accounts.add(new Account(100, "Bob", 1000));
		accounts.add(new Account(500, "Linda", 3000));
		accounts.add(new Account(300, "David", 2000));
		
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
		
		Collections.sort(accounts);

		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
		
	}

}
