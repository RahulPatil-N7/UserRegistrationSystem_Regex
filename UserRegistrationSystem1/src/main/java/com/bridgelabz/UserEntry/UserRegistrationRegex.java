package com.bridgelabz.UserEntry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
	
	Scanner scanner = new Scanner(System.in); 
	
	//Uc1 - Validate first name using regex
	public void validFirstName() {
		System.out.println("\nEnter first name : ");
		String firstName = scanner.nextLine();
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
		
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println(firstName+" is valid.");
		}
		else {
			System.out.println(firstName+" is invalid! Name should start with capital letter & have minimum 3 characters.");
			validFirstName();
		}
	}
	
	//Uc2 - Validate last name using regex
	public void validLastName() {
		System.out.println("\nEnter last name : ");
		String lastName = scanner.nextLine();
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
			
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			System.out.println(lastName+" is valid.");
		}
		else {
			System.out.println(lastName+" is invalid! Name should start with capital letter & have minimum 3 characters.");
			validLastName();
		}
	}

	//Uc3 - Validate email using regex
	public void validEMail() {
		System.out.println("\nEnter Email Id : ");
		String eMail = scanner.nextLine();
		String regex = ("[a-zA-Z-0-9]{3,}@[a-zA-Z]{2,}\\.+[a-zA-Z]{2,}");
				
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if (matcher.matches()) {
			System.out.println(eMail+" is valid.");
		}
		else {
			System.out.println(eMail+" is invalid!");
			validEMail();
		}
	}
	
	//Uc4,5 - Validate password using regex - minimum 8 characters,at least one capital letter
	public void validPassWord() {
		System.out.println("\nEnter password : ");
		String passWord = scanner.nextLine();
		String regex = ("(?=.*[A-Z]){1,}[a-zA-Z0-9]{8,}");
					
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(passWord);
		if (matcher.matches()) {
			System.out.println(passWord+" is valid.");
		}
		else {
			System.out.println(passWord+" is invalid!");
			validPassWord();
		}
	}

}

