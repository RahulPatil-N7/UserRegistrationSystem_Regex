package com.bridgelabz.JUnitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class UserParameterizedTest {

	private String actual;
	private String expected;
	private UserRegistration read;

	public UserParameterizedTest(String actual, String expected) {
		this.actual = actual;
		this.expected = expected;
	}
	
	@Before
	public void init() {
		read = new UserRegistration();
	}
	
	//parameterized test to validate given email sets
	@Parameterized.Parameters
	public static Collection<Object[]> emailSetInput() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com","Happy" }, { "abc-100@yahoo.com","Happy" },
			{ "abc.100@yahoo.com","Happy" }, { "abc111@abc.com","Happy" }, { "abc-100@abc.net","Happy" },
			{ "abc.100@abc.com.au","Happy" }, {"abc@1.com","Happy"}, {"abc@gmail.com.com","Happy"}, {"abc+100@gmail.com","Happy"},
			{"abc","Sad"}, {"abc@.com.my","Sad"}, {"abc123@gmail.a","Sad"}, {"abc123@.com","Sad"},{"abc123@.com.com","Sad"},
			{".abc@abc.com","Sad"}, {"abc()*@gmail.com","Sad"}, {"abc@%*.com","Sad"}, {"abc..2002@gmail.com","Sad"},
			{"abc.@gmail.com","Sad"}, {"abc@abc@gmail.com","Sad"}, {"abc@gmail.com.1a","Sad"}, {"abc@gmail.com.aa.au","Sad"} } );
	}
	
	@Test
	public void givenEmailList_testEachEmail() {
		assertEquals(expected, read.validEMailSet(actual));
	}

}