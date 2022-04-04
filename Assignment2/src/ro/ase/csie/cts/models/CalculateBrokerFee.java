package ro.ase.csie.cts.models;

public class CalculateBrokerFee {

	public final static double BROKER_FEE = .0125;
	public final static int NO_DAYS = 365;

	public static double calculateTotalFee(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE * calculateAccountFee(account);
		}
		return totalFee;
	}
	
	public static double calculateAccountFee(Account account) {
		double result;
		result = account.loanValue * (Math.pow(account.rate, (account.daysActive / NO_DAYS)) - 1);
		return result;
	}
}
