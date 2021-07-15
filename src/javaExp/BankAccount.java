package javaExp;

public class BankAccount {
	private int number;
	private int valance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public int getNumber() {
		return this.number;
	}

	public int getValance() {
		return this.valance;
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

	public void setValance(int valance) {
		this.valance = valance;
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

	public void addValance(int valance) {
		this.valance = this.valance + valance;
	}

	public void deductValance(int valance) {
		this.valance = this.valance - valance;
	}
}
