package com.bridgelabz.UserEntry;

import java.util.ArrayList;
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
		
		String regex = ("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$");		
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
	
	//Uc4,5,6,7- Validate password using regex - minimum 8 characters,at least one capital letter,number,special character
	public void validPassWord() {
		System.out.println("\nEnter password : ");
		String passWord = scanner.nextLine();
		String regex = ("(?=.*[A-Z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}");
					
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
	
	//Uc8 - Validate mobile number using regex
	public void validMobileNumber() {
		System.out.println("\nEnter mobile number :");
		String mobileNumber = scanner.nextLine();
		String regex = ("[0-9]{2}[\\s][6789]{1}[0-9]{9}");
					
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			System.out.println(mobileNumber+" is valid.");
		}
		else {
			System.out.println(mobileNumber+" is invalid!");
			validMobileNumber();
		}
	}
	
	//Uc9 - Validate email sets using regex
	public void validEMailSet() {
		System.out.println("\nChecking validity of e-mail lists :\n ");
		ArrayList <String> arrayList = new ArrayList<String>();
		String regex = ("^[a-zA-Z0-9]+{2,}[- . + _]?[a-zA-Z0-9]{2,}[@](?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}");
		Pattern pattern = Pattern.compile(regex);
		
		//Valid Email list
		arrayList.add("abc@yahoo.com");
        	arrayList.add("abc-100@yahoo.com");
        	arrayList.add("abc.100@yahoo.com");
        	arrayList.add("abc111@abc.com");
        	arrayList.add("abc-100@abc.net");
        	arrayList.add("abc.100@abc.com.au");
        	arrayList.add("abc@1.com");
        	arrayList.add("abc@gmail.com.com");
        	arrayList.add("abc+100@gmail.com");

        	//Invalid Email list.
        	arrayList.add("abc");
        	arrayList.add("abc@.com.my");
        	arrayList.add("abc123@gmail.a");
        	arrayList.add("abc123@.com");
        	arrayList.add("abc123@.com.com");
        	arrayList.add(".abc@abc.com");
        	arrayList.add("abc()*@gmail.com");
        	arrayList.add("abc@%*.com");
        	arrayList.add("abc..2002@gmail.com");
        	arrayList.add("abc.@gmail.com");
        	arrayList.add("abc@abc@gmail.com");
       		arrayList.add("abc@gmail.com.1a");
        	arrayList.add("abc@gmail.com.aa.au");
		for (String array : arrayList) {
			Matcher matcher = pattern.matcher(array);
			
			/* if email in list is valid it returns true
			 *  & returns false if email is invalid by
			 *  checks with compiled regular expression
			 */
			if (matcher.matches()) {    
				System.out.println("Valid email :\t"+ array + ":--------->\t" + matcher.matches());
			}
			else {
				System.out.println("Invalid email :\t"+ array + ":---------->\t" + matcher.matches());
			}
		}
		
	}

}

