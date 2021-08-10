package javaExp;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	public boolean newCustomer(String name, double initialTransaction) {
		if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
	}

	public boolean addCustomerTransaction(String name, double transaction) {
		if (findCustomer(name) != null) {
			findCustomer(name).addTransaction(transaction);
			return true;
		}
		return false;
	}

	private Customer findCustomer(String name) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == name) {
				return customers.get(i);
			}
		}
		return null;
	}
}
