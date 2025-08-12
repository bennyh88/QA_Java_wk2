package lab10b;


public class Account implements Comparable<Account> {
	int id; 
	double balance; 
	String owner;

	Account (int id, String owner, double balance) {
		this.id = id; 
		this.balance = balance; 
		this.owner = owner;
	}
	
	void withdraw(double amount) throws IllegalArgumentException{
		if (amount > this.balance) {
			throw new IllegalArgumentException();
		} else {
			this.balance -= amount;
		}
	}
	
	void deposit(double amount) {
		this.balance += amount;
	}
	
	void close() {
		System.out.printf("Account ID:%d is closed\n", this.id);
	}
	
	String getDetails() {
		return String.format("ID:%d, Owner:%s, Balance:%g", this.id, this.owner, this.balance);
	}

	@Override
	public int compareTo(Account other) {
		//return (int)(this.balance - other.balance);
		//return (int)(this.owner - other.owner);
		return (int)(this.owner.compareTo(other.owner));
	}
	
}

//class BadIDException extends Exception { }