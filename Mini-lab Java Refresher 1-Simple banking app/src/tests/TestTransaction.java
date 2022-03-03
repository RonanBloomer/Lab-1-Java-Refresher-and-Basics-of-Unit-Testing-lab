package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Transaction;

public class TestTransaction {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String test_account_number = "40235962";
		double test_transaction_amount= 4000;
		Date test_transaction_date = new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019");
		
		// 2-Exercise, run the object under test
		Transaction testTransaction= new Transaction(test_account_number, test_transaction_amount, test_transaction_date);
		
		
		Boolean passed = true;
		
		if (!testTransaction.getAccount_number().equals(test_account_number)) {
			System.out.println("TC1 Failed: account number did not match");
			passed = false;
		}
		if (testTransaction.getTransaction_amount() != test_transaction_amount) {
			System.out.println("TC2 Failed: transaction amount did not match");
			passed = false;
		}
		
		/* TODO: if-code blocks just like the above two,
		 to verify the other three field of the class  */
		
		if (testTransaction.getTransaction_date() != test_transaction_date) {
			System.out.println("TC2 Failed: transaction date did not match");
			passed = false;
		}
		
		
		if (passed) {
			System.out.println("All TC's passed.");
		}
		
		// using assert's
		
		assert testTransaction.getAccount_number().equals(test_account_number);
		assert testTransaction.getTransaction_amount() == test_transaction_amount;
		assert testTransaction.getTransaction_date() == test_transaction_date;
		//assert 5==2;
		//assert 1==2;
		/* TODO: add the other assertions like the above one,
		 to verify the other four fields of the class */
		System.out.println("All Java assertions in the test suite passed (none failed).");
				
	}

}
