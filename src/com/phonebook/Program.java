package com.phonebook;

public class Program {
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		phonebook.addInPhonebook("Denis Hristov", "0898956350");
		phonebook.addInPhonebook("Dimitar Balashev", "+359872361456");
		phonebook.addInPhonebook("Ralica Stoqnova", "0887231555");
		phonebook.deleteFromPhonebook("Dimitar Balashev");
		phonebook.printAll();
		phonebook.searchByName("Ralica Stoqnova");
	}
}
