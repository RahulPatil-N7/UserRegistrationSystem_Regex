package com.bridgelabz.UserEntry;

/* User Registration System needs
 * to ensure all validations
 * are in place during the User Entry
 */
public class UserRegistrationMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("---------------------------Welcome to User Registration System---------------------------");
		//creating user object to call USerRegistrationRegex functions
		UserRegistrationRegex user = new UserRegistrationRegex();
		
		user.validateFirstName();
		user.validateLastName();
		user.validateEMail();
		user.validateMobileNumber();
		user.validatePassword(); 
		user.validateEMailSet();
		
	}

}
