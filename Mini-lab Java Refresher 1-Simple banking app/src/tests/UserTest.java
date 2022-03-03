package tests;

import model.User;
import model.Account;
import model.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserTest {

	public static void main(String[] args) throws ParseException {
		//Old manual tests commented out below
		/*
		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
		Account testAccount = new Account("13", "Fatimah", "Standard", new SimpleDateFormat("dd/MM/yyyy").parse("24/02/1994"));
		Transaction testTransaction = new Transaction("111", 20, new SimpleDateFormat("dd/MM/yyyy").parse("24/02/1994"));
				
		System.out.println(testUser);
		System.out.println(testAccount);
		System.out.println(testTransaction); 
		*/
		
		// automated testing
		// 1-setup the object and test data, initialise
		// see the four step in
		
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		// 2-Exercise, run the object under test
		User testUser = new User(test_username, test_password,test_first_name, test_last_name, test_mobile_number);
		
		
		Boolean passed = true;
		System.out.println(testUser.getUsername() + " " + test_username);
		if (!testUser.getUsername().equals(test_username)) {
			System.out.println("TC1 Failed: username did not match");
			passed = false;
		}
		System.out.println(testUser.getPassword() + " " + test_password);
		if (!testUser.getPassword().equals(test_password)) {
			System.out.println("TC2 Failed: password did not match");
			passed = false;
		}
		System.out.println(testUser.getFirst_name() + " " + test_first_name);
		if (!testUser.getFirst_name().equals(test_first_name)) {
			System.out.println("TC3 Failed: first name did not match");
			passed = false;
		}
		System.out.println(testUser.getLast_name() + " " + test_last_name);
		if (!testUser.getLast_name().equals(test_last_name)) {
			System.out.println("TC4 Failed: last name did not match");
			passed = false;
		}
		System.out.println(testUser.getMobile_number() + " " + test_mobile_number);
		if (!testUser.getMobile_number().equals(test_mobile_number)) {
			System.out.println("TC5 Failed: mobile number did not match");
			passed = false;
		}
		
		if (passed) {
			System.out.println("All TC's passed.");
		}
		
		// using assert's
		
		assert testUser.getUsername().equals(test_username);
		assert testUser.getPassword().equals(test_password);
		assert testUser.getFirst_name().equals(test_first_name);
		assert testUser.getLast_name().equals(test_last_name);
		assert testUser.getMobile_number().equals(test_mobile_number);
		//assert 1==2;
		
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
	}

}
