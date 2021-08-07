package javaExp;

import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> myContacts;
	private String myNumber;

	public MobilePhone(String myNumber) {
		this.myContacts = new ArrayList<>();
		this.myNumber = myNumber;
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			return false;
		}
		myContacts.add(contact);
		return true;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		if (myContacts.contains(oldContact)) {
			int position = myContacts.indexOf(oldContact);
			myContacts.set(position, newContact);
			return true;
		}
		return false;
	}

	public boolean removeContact(Contact contact) {
		if (myContacts.contains(contact)) {
			int position = myContacts.indexOf(contact);
			myContacts.remove(position);
			return true;
		}
		return false;
	}

	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}

	private int findContact(String name) {
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName() == name) {
				return i;
			}
		}
		return -1;
	}

	public Contact queryContact(String name) {
		int position = findContact(name);
		if (position >= 0) {
			return this.myContacts.get(position);
		}
		return null;
	}

	public void printContacts() {
		System.out.println("Contact List:");
		for (int i = 0; i < myContacts.size(); i++) {
			System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
		}
	}
}
