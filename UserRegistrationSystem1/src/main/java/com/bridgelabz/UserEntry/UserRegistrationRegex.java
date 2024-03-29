package com.bridgelabz.UserEntry;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.UserEntry.UserRegistrationExceptions.ExceptionType;

public class UserRegistrationRegex {
	
	Scanner scanner = new Scanner(System.in); 
	
	//Uc1 - Validate first name using regex
	public void validateFirstName() throws UserRegistrationExceptions {
		System.out.println("\n1)Enter First Name :");
		String firstName = scanner.nextLine();
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		try {
			if (firstName.length() == 0) {
				throw new UserRegistrationExceptions(ExceptionType.EMPTY, "First Name is mandatory.");
			}
			if (matcher.matches()) {
				System.out.println(firstName+" is valid.");
			}
			else {
				throw new UserRegistrationExceptions(ExceptionType.INVALID, "Name should start with capital letter & have minimum 3 characters");
			}
		}
		catch (UserRegistrationExceptions e) {
			System.out.println(e.toString());
			validateFirstName();
		}
	}
	
	//Uc2 - Validate last name using regex
	public void validateLastName() {
		System.out.println("\n2)Enter Last Name :");
		String lastName = scanner.nextLine();
		String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");
			
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		try {
			if (lastName.length() == 0) {
				throw new UserRegistrationExceptions(ExceptionType.EMPTY, "Last Name is mandatory.");
			}
			if (matcher.matches()) {
				System.out.println(lastName+" is valid.");
			}
			else {
				throw new UserRegistrationExceptions(ExceptionType.INVALID, "Name should start with capital letter & have minimum 3 characters");
				//System.out.println(firstName+" is invalid! Name should start with capital letter & have minimum 3 characters.");
			}
		}
		catch (UserRegistrationExceptions e) {
			System.out.println(e.toString());
			validateLastName();
		}
	}

	//Uc3 - Validate email using regex
	public void validateEMail() {
		System.out.println("\n3)Enter Email Id :");
		String eMail = scanner.nextLine();
		
		String regex = ("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$");		
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		try {
			if (eMail.length() == 0) {
				throw new UserRegistrationExceptions(ExceptionType.EMPTY, "E-mail is mandatory.");
			}
			if (matcher.matches()) {
				System.out.println(eMail+" is valid.");
			}
			else {
				throw new UserRegistrationExceptions(ExceptionType.INVALID, "Email should have valid format");
			}
		}
		catch (UserRegistrationExceptions e) {
			System.out.println(e.toString());
			validateEMail();
		}
	}
	
	//UC4,5,6,7- Validate password using regex - minimum 8 characters,at least one capital letter,number,special character
	public void validatePassword() {
		System.out.println("\n4)Enter Password : ");
		String passWord = scanner.nextLine();
		String regex = ("(?=.*[A-Z]){1,}(?=.*[a-z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}");
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(passWord);
		try {
			if (passWord.length() == 0) {
				throw new UserRegistrationExceptions(ExceptionType.EMPTY, "Password is mandatory.");
			}
			if (matcher.matches()) {
				System.out.println(passWord+" is valid.");
			}
			else {
				throw new UserRegistrationExceptions(ExceptionType.INVALID, "Password should have valid format");
				//System.out.println(firstName+" is invalid! Name should start with capital letter & have minimum 3 characters.");
			}
		}
		catch (UserRegistrationExceptions e) {
			System.out.println(e.toString());
			validatePassword();
		}
	}
	
	//Uc8 - Validate mobile number using regex
	public void validateMobileNumber() {
		System.out.println("\n5)Enter Mobile Number :");
		String mobileNumber = scanner.nextLine();
		String regex = ("[0-9]{2}[\\s][6789]{1}[0-9]{9}");
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		try {
			if (mobileNumber.length() == 0) {
				throw new UserRegistrationExceptions(ExceptionType.EMPTY, "Mobile Number is mandatory.");
			}
			if (matcher.matches()) {
				System.out.println(mobileNumber+" is valid.");
			}
			else {
				throw new UserRegistrationExceptions(ExceptionType.INVALID, "Number should have space after country code.");
				//System.out.println(firstName+" is invalid! Name should start with capital letter & have minimum 3 characters.");
			}
		}
		catch (UserRegistrationExceptions e) {
			System.out.println(e.toString());
			validateMobileNumber();
		}
	}

	//Uc9 - Validate email sets using regex
	public void validateEMailSet() {
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

