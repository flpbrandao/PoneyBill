package entities;

public class Account {
	
	private Double balance;
	private String name;
	
	public Account () {
		
	}

	public Account(Double balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void addBalance (double value) {
		this.balance += value;
	}
	public void removeBalance(double value) {
		this.balance -= value;
	}
	public void addToMovement() {
		//This will append data to a .txt file
	}


}
