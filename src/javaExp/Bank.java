package javaExp;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public boolean addBranch(String name) {
		if (findBranch(name) == null) {
			branches.add(new Branch(name));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String nameBranch, String nameCustomer, double transaction) {
		if (findBranch(nameBranch) != null) {
			return findBranch(nameBranch).newCustomer(nameCustomer, transaction);
		}
		return false;
	}

	public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double transaction) {
		if (findBranch(nameBranch) != null) {
			return findBranch(nameBranch).addCustomerTransaction(nameCustomer, transaction);
		}
		return false;
	}

	private Branch findBranch(String name) {
		for (int i = 0; i < branches.size(); i++) {
			if (branches.get(i).getName() == name) {
				return branches.get(i);
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch " + branch.getName());
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
				if (showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
					}
				}
			}
			return true;
		}
		return false;
	}
}
