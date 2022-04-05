package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.NegativeAccountValueException;
import ro.ase.csie.cts.exceptions.NegativeDaysActiveException;
import ro.ase.csie.cts.exceptions.NegativeRateException;

public class Main {

	public static void main(String[] args) {
		System.out.println(AccountType.PREMIUM);
		try {
			Account[] accounts = new Account[2];
			accounts[0] = new Account(10210, 0.5, AccountType.BUDGET, 100);
			accounts[1] = new Account(100023, 6, AccountType.PREMIUM, 504);
			System.out.println(accounts[0]);
			System.out.println(accounts[1]);
			System.out.println(Account.calculateBrokerFee(accounts));
		} catch (NegativeAccountValueException | NegativeRateException | NegativeDaysActiveException e) {
			e.printStackTrace();
		}
	}
}
