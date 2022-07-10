package com.bridgelabz.UserEntry;

/* User Registration System needs
 * to ensure all validations
 * are in place during the User Entry
 */
public class UserRegistrationMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration System.");
		//creating user object to call USerRegistrationRegex functions
		UserRegistrationRegex user = new UserRegistrationRegex();
		
		user.validFirstName();
		user.validLastName();

	}

}
