package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.NegativeAccountValueException;
import ro.ase.csie.cts.exceptions.NegativeDaysActiveException;
import ro.ase.csie.cts.exceptions.NegativeRateException;

public class Account {
	public double loanValue;
	public double rate;
	public int daysActive;
	public AccountType accountType;

	public final static double BROKER_FEE = .0125;
	public final static int NO_DAYS = 365;

	// getters
	public double getLoan() {
		return loanValue;
	}

	public double getRate() {
		return rate;
	}

	public double getDaysActive() {
		return daysActive;
	}
	
	//setters
	public void setLoanValue(double loanValue) throws NegativeAccountValueException {
		if (loanValue < 0)
			throw new NegativeAccountValueException();
		this.loanValue = loanValue;
	}
	
	public void setRate(double rate) throws NegativeRateException{
		if (rate < 0)
			throw new NegativeRateException();
		this.rate = rate;
	}
	
	public void setDaysActive(int daysActive) throws NegativeDaysActiveException{
		if (daysActive < 0)
			throw new NegativeDaysActiveException();
		this.daysActive = daysActive;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue * rate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType;
	}

	public static double calculateBrokerFee(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE * ( // 1.25% broker's fee
				account.loanValue * Math.pow(account.rate, (account.daysActive / NO_DAYS)) - account.loanValue); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double rate, AccountType accountType, int daysActive) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
		this.daysActive = daysActive;
	}

}
