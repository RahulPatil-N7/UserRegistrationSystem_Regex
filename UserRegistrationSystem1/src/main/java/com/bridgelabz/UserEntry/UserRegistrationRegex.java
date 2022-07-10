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

}
