package com.bridgelabz.JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	/* Tests whether first name has proper format or not.
	 * First name should have first letter capital and
	 * minimum characters */
	@Test
	public void givenString_ShoudReturnTrue_IfFirstCharatcterIsCaptitalAndHasMinimumThreeCharactersInFirstName() {
		UserRegistration user = new UserRegistration();
		
		String actual = user.validFirstName("Rahul");
		String expected = "Happy";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInFirstName() {
		UserRegistration user = new UserRegistration();
		
		String actual = user.validFirstName("rahul");
		String expected = "Sad";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfThereAreLessThamThreeCharactersInFirstName() {
		UserRegistration user = new UserRegistration();
		
		String result = user.validFirstName("Rh");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}
	
	/* Tests whether last name has proper format or not.
	 * Last name should have first letter capital and
	 * minimum characters */
	@Test
	public void givenString_ShouldReturnTrue_IfFirstCharatcterIsCapitalHasMinimumThreeCharactersInLastName() {
		UserRegistration user = new UserRegistration();
		
		String actual = user.validFirstName("Patil");
		String expected = "Happy";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsNotCapitalInLastName() {
		UserRegistration user = new UserRegistration();
		
		String result = user.validLastName("patil");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfFirstCharatcterIsCapitalButHasLessThanThreeCharactersInLastName() {
		UserRegistration user = new UserRegistration();
		
		String result = user.validLastName("Pa");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	/* Tests whether email has proper format or not
	 * EMail format-abc.xyz@bl.co.in where 
	 * abc@bl.co is mandatory part and .xyz, .in are optional */
	@Test
	public void givenString_ShouldReturnFalse_IfEmailDoesNotHaveAtSymbol() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc.xyz.co.in");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasMoreThanThreeTLD() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc.xyz@bl.co.in.co");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasOneCharacterTLD() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc.xyz@.co.i");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasTwoContinuousDots() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc..xyz@co.in");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasThreeDotsBeforeAtSymbol() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("alb.xyz.co@.in");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfEmailHasDigitsInTLD() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc.xyz@c1.in");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnTrue_IfEmailHasProperFormatAsRequired() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validEMail("abc.xyz@bl.co.in");
		String expected = "Happy";
		Assert.assertEquals(result, expected);
	}

	/* Tests whether mobile number has proper format or not.
	 * Mobile number should have space after country code
	 * while country code is also mandatory */
	@Test
	public void givenString_ShouldReturnTrue_IfMobileNumberHasSpaceAfterCountryCodeAndTenDigitsNumber() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validMobileNumber("91 9967116186");
		String expected = "Happy";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberDoesNotHaveSpaceAfterCountryCode() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validMobileNumber("919967116186");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasMoreThanTenDigits() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validMobileNumber("9199671161861");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}
	
	@Test
	public void givenString_ShouldReturnFalse_IfMobileNumberHasLessThanTenDigits() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validMobileNumber("91996711618");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	/* Tests whether password has proper format or not.
	 * Password should have at least one uppercase,one
	 * lowercase & one speacial character. Minimum character
	 * should be eight */
	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneUpperCaseLetter() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validMobileNumber("rahul@123");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneSpecialCharacter() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validPassWord("rahul123");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveAtLeastOneLowerCaseLetter() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validPassWord("RAHUL@123");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnFalse_IfPassWordDoesNotHaveMinimumEightCharacters() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validPassWord("R@123");
		String expected = "Sad";
		Assert.assertEquals(result, expected);
	}

	@Test
	public void givenString_ShouldReturnTrue_IfPassWordIsAcceptedAsPerRequiredFormat() {

		UserRegistration user = new UserRegistration();
		
		String result = user.validPassWord("Abccc@123");
		String expected = "Happy";
		Assert.assertEquals(result, expected);
	}
	
}
