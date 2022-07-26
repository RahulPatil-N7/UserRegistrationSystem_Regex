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
			user.validFirstName("Rahul");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInFirstName() {
		try {	
			user.validFirstName("rahul");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfThereAreLessThamThreeCharactersInFirstName() throws UserRegistrationExceptions {
		
		try {	
			user.validFirstName("ra");
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
			user.validLastName("Patil");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInLastName() {
		try {	
			user.validLastName("patil");
		}
		catch(UserRegistrationExceptions exception) { 
			String expected = "Name is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsCapitalButHasLessThanThreeCharactersInLastName() {
		try {	
			user.validLastName("pa");
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
			user.validEMail("abc.xyz.co.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasMoreThanThreeTLD() {
		try {
			user.validEMail("abc.xyz@bl.co.in.co");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasOneCharacterTLD() {
		try {
			user.validEMail("abc.xyz@.co.i");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasTwoContinuousDots() {
		try {
			user.validEMail("abc..xyz@co.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasThreeDotsBeforeAtSymbol() {
		try {
			user.validEMail("abc.xyz.co@.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasDigitsInTLD() {
		try {
			user.validEMail("abc.xyz@c1.in");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "E-mail is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnTrue_IfEmailHasProperFormatAsRequired() {
		try {
			user.validEMail("abc.xyz@bl.co.in");
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
			user.validMobileNumber("91 9967116186");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is valid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberDoesNotHaveSpaceAfterCountryCode() {
		try {
			user.validMobileNumber("919967116186");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasMoreThanTenDigits() {
		try {
			user.validMobileNumber("9199671161861");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Number is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasLessThanTenDigits() {
		try {
			user.validMobileNumber("91 996711618");
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
			user.validPassWord("rahul@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneSpecialCharacter() {
		try {
			user.validPassWord("rahul123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneLowerCaseLetter() {
		try {
			user.validPassWord("RAHUL@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveMinimumEightCharacters() {
		try {
			user.validPassWord("R@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}

	@Test
	public void givenString_ShouldReturnTrue_IfPassWordIsAcceptedAsPerRequiredFormat() {
		try {
			user.validPassWord("Rahul@123");
		}
		catch(UserRegistrationExceptions exception) {
			String expected = "Password is invalid";
			Assert.assertEquals(exception.toString(), expected);
		}
	}
	
}
