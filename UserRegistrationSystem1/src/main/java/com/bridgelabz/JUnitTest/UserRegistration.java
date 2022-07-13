package com.bridgelabz.JUnitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Uc1 - Validate first name using regex
	public static String validFirstName(String firstName) {
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
		
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			return "Valid";
		}
		else {
			return "InValid";
		}
	}
	
	//Uc2 - Validate last name using regex
	public static String validLastName(String lastName) {
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
			
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			return "Valid";
		}
		else {
			return "InValid";
		}
	}

	//Uc3 - Validate email using regex
	public static String validEMail(String eMail) {
		String regex = ("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z]+.[a-z]{2,3}(.[a-z]{2})?$");		
		
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if (matcher.matches()) {
			return "Valid";
		}
		else {
			return "InValid";
		}
	}
	
	//Uc4,5,6,7- Validate password using regex - minimum 8 characters,at least one capital letter,number,special character
	public static String validPassWord(String passWord) {
		String regex = ("(?=.*[A-Z]){1,}(?=.*[a-z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}");
					
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(passWord);
		if (matcher.matches()) {
			return "Valid";
		}
		else {
			return "InValid";
		}
	}
	
	//Uc8 - Validate mobile number using regex
	public static String validMobileNumber(String mobileNumber) {
		String regex = ("[0-9]{2}[\\s][6789]{1}[0-9]{9}");
					
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			return "Valid";
		}
		else {
			return "InValid";
		}
	}

}
