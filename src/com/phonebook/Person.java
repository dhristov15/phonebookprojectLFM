package com.phonebook;

public class Person {
	private String name;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person() {
		name = "";
		phoneNumber = "";
	}

	public Person(String name, String phoneNumber) {
		setName(name);
		setphoneNumber(phoneNumber);
	}

	static boolean isDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	static boolean isFrom2to9(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '2' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	static boolean isNumberValid(String enteredNumber) {
		String prefix1 = "+3598";
		String prefix2 = "08";
		String currentNumber = enteredNumber;

		if (currentNumber.startsWith(prefix1) || currentNumber.startsWith(prefix2)) {
			if (currentNumber.startsWith(prefix1)) {
				if (currentNumber.length() == 13) {
					currentNumber = currentNumber.substring(5, 13);
				} else {
					return false;
				}
			}
			if (currentNumber.startsWith(prefix2)) {
				if (currentNumber.length() == 10) {
					currentNumber = currentNumber.substring(2, 10);
				} else {
					return false;
				}
			}
			if ((currentNumber.startsWith("7") || currentNumber.startsWith("8") || currentNumber.startsWith("9"))) {
				currentNumber = currentNumber.substring(1, 8);
				if (isFrom2to9(currentNumber)) {
					currentNumber = currentNumber.substring(1, 7);
					if (isDigit(currentNumber)) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return this.name + ": " + this.phoneNumber;
	}
}
