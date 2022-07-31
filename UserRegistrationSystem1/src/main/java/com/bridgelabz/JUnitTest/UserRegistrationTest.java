package com.bridgelabz.JUnitTest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.UserEntry.UserRegistrationExceptions;

public class UserRegistrationTest {
	
	UserRegistration user = new UserRegistration();
	/* Tests whether first name has proper format or not.
	 * First name should have first letter capital and
	 * minimum characters */
	@Test
	public void givenString_ShoudReturnTrue_IfFirstCharatcterIsCaptitalAndHasMinimumThreeCharactersInFirstName() throws UserRegistrationExceptions {
		
		try {	
			user.validateFirstName("Rahul");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInFirstName() {
		try {	
			user.validateFirstName("rahul");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfThereAreLessThamThreeCharactersInFirstName() throws UserRegistrationExceptions {
		
		try {	
			user.validateFirstName("ra");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	/* Tests whether last name has proper format or not.
	 * Last name should have first letter capital and
	 * minimum characters */
	@Test
	public void givenString_ShouldReturnTrue_IfFirstCharatcterIsCapitalHasMinimumThreeCharactersInLastName() {
		try {	
			user.validateLastName("Patil");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInLastName() {
		try {	
			user.validateLastName("patil");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsCapitalButHasLessThanThreeCharactersInLastName() {
		try {	
			user.validateLastName("pa");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	/* Tests whether email has proper format or not
	 * EMail format-abc.xyz@bl.co.in where 
	 * abc@bl.co is mandatory part and .xyz, .in are optional */
	@Test
	public void givenString_ShouldReturnFalse_IfEmailDoesNotHaveAtSymbol() throws UserRegistrationExceptions {
		try {
			user.validateEMail("abc.xyz.co.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasMoreThanThreeTLD() {
		try {
			user.validateEMail("abc.xyz@bl.co.in.co");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasOneCharacterTLD() {
		try {
			user.validateEMail("abc.xyz@.co.i");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasTwoContinuousDots() {
		try {
			user.validateEMail("abc..xyz@co.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasThreeDotsBeforeAtSymbol() {
		try {
			user.validateEMail("abc.xyz.co@.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasDigitsInTLD() {
		try {
			user.validateEMail("abc.xyz@c1.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnTrue_IfEmailHasProperFormatAsRequired() {
		try {
			user.validateEMail("abc.xyz@bl.co.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	/* Tests whether mobile number has proper format or not.
	 * Mobile number should have space after country code
	 * while country code is also mandatory */
	@Test
	public void givenString_ShouldReturnTrue_IfMobileNumberHasSpaceAfterCountryCodeAndTenDigitsNumber() {
		try {
			user.validateMobileNumber("91 9967116186");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberDoesNotHaveSpaceAfterCountryCode() {
		try {
			user.validateMobileNumber("919967116186");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasMoreThanTenDigits() {
		try {
			user.validateMobileNumber("9199671161861");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasLessThanTenDigits() {
		try {
			user.validateMobileNumber("91 996711618");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	/* Tests whether password has proper format or not.
	 * Password should have at least one uppercase,one
	 * lowercase & one speacial character. Minimum character
	 * should be eight */
	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneUpperCaseLetter() {
		try {
			user.validatePassword("rahul@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneSpecialCharacter() {
		try {
			user.validatePassword("rahul123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneLowerCaseLetter() {
		try {
			user.validatePassword("RAHUL@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveMinimumEightCharacters() {
		try {
			user.validatePassword("R@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnTrue_IfPassWordIsAcceptedAsPerRequiredFormat() {
		try {
			user.validatePassword("Rahul@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
}
