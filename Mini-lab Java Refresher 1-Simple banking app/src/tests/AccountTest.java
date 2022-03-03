package tests;

import model.Account;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String test_account_number = "40235962";
		String test_username_of_account_holder = "ronan@gmail.com";
		String test_account_type = "Standard"; //"Standard " or  "Saving"
		Date test_account_opening_date = new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019");
		
		// 2-Exercise, run the object under test
		Account testAccount = new Account(test_account_number, test_username_of_account_holder, test_account_type, test_account_opening_date);
		
		
		Boolean passed = true;
		
		if (!testAccount.getAccount_number().equals(test_account_number)) {
			System.out.println("TC1 Failed: account number did not match");
			passed = false;
		}
		if (!testAccount.getUsername_of_account_holder().equals(test_username_of_account_holder)) {
			System.out.println("TC2 Failed: user name of account holder did not match");
			passed = false;
		}
		
		if (!testAccount.getAccount_type().equals( test_account_type)) {
			System.out.println("TC2 Failed: account type did not match");
			passed = false;
		}
		if (testAccount.getAccount_opening_date() != test_account_opening_date) {
			System.out.println("TC2 Failed: account opening date did not match");
			passed = false;
		}
		
		
		
		if (passed) {
			System.out.println("All TC's passed.");
		}
		
		// using assert's
		
		assert testAccount.getAccount_number() == test_account_number;
		assert testAccount.getUsername_of_account_holder() == test_username_of_account_holder;
		assert testAccount.getAccount_type() == test_account_type;
		assert testAccount.getAccount_opening_date() == test_account_opening_date;
		//assert 5==2;
		//assert 1==2;
		/* TODO: add the other assertions like the above one,
		 to verify the other four fields of the class */
		System.out.println("All Java assertions in the test suite passed (none failed).");
				
			}
	}


