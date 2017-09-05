package com.phonebook;

import java.util.ArrayList;

public class Phonebook {
	private ArrayList<Person> people = new ArrayList<Person>();

	public void addInPhonebook(String name, String phoneNumber) {
		if(!Person.isNumberValid(phoneNumber)) {
			System.out.println("Invalid number has been entered");
		} else {
		people.add(new Person(name, phoneNumber));
		}
	}

	public void deleteFromPhonebook(String name) {
		if (people.isEmpty()) {
			System.out.println("No entered data in phonebook");
		} else {
			for (int i = 0; i < people.size(); i++) {
				if(people.get(i).getName().equals(name)) {
					people.remove(i);
				} 
			}
		}
	}
	public void searchByName(String name) {
		for(int i=0;i<people.size();i++) {
			if(people.get(i).getName().equals(name)) {
				System.out.println(people.get(i).toString());
			}
		}
	}
	public void printAll() {
		if(people.isEmpty()) {
			System.out.println("No entered data in phonebook");
		} else {
				System.out.println(people.toString());
			}
		}
	}
