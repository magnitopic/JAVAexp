package javaExp;

public class BankAccount {
	private int number;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount(String customerName,String email,String phoneNumber,int number,int balance){
		
	}

	public void addBalance(int balance) {
		this.balance += balance;
	}

	public void deductBalance(int balance) {
		if (this.balance - balance >= 0) {
			this.balance -= balance;
		} else {
			System.out.println("Balance deduct too high. Rejected.");
		}
	}

	public int getNumber() {
		return this.number;
	}

	public int getBalance() {
		return this.balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
