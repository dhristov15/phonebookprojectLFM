package com.phonebook;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int choice = 0;
		String name = "";
		String phoneNumber = "";
		Scanner scanner = new Scanner(System.in);
		Phonebook phonebook = new Phonebook();

		while (choice != 5) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("1.Add a person to the phonebook");
			System.out.println("2.Delete a person from the phonebook");
			System.out.println("3.Search a person by their name");
			System.out.println("4.Show all data in the phonebook");
			System.out.println("5.Exit");
			System.out.print("Your choice:");
			choice = scanner.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				name = scanner.next();
				System.out.print("Enter phone number: ");
				phoneNumber = scanner.next();
				phonebook.addInPhonebook(name, phoneNumber);
				break;
			case 2:
				System.out.print("Enter name: ");
				name = scanner.next();
				phonebook.deleteFromPhonebook(name);
				break;
			case 3:
				System.out.print("Enter name: ");
				name = scanner.next();
				phonebook.searchByName(name);
				break;
			case 4:
				phonebook.printAll();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("No such choice");
			}
		}
		// Phonebook phonebook = new Phonebook();
		// phonebook.addInPhonebook("Denis Hristov", "0898956350");
		// phonebook.addInPhonebook("Dimitar Balashev", "+359872361456");
		// phonebook.addInPhonebook("Ralica Stoqnova", "0887231555");
		// phonebook.deleteFromPhonebook("Dimitar Balashev");
		// phonebook.printAll();
		// phonebook.searchByName("Ralica Stoqnova");
	}
}
