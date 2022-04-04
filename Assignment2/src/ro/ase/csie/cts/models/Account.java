package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.NegativeAccountValueException;
import ro.ase.csie.cts.exceptions.NegativeDaysActiveException;
import ro.ase.csie.cts.exceptions.NegativeRateException;

public class Account {
	public double loanValue;
	public double rate;
	public int daysActive;
	public AccountType accountType;

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

	// setters
	public void setLoanValue(double loanValue) throws NegativeAccountValueException {
		if (loanValue < 0)
			throw new NegativeAccountValueException();
		this.loanValue = loanValue;
	}

	public void setRate(double rate) throws NegativeRateException {
		if (rate < 0)
			throw new NegativeRateException();
		this.rate = rate;
	}

	public void setDaysActive(int daysActive) throws NegativeDaysActiveException {
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

	// compute the broker fee
	public static double calculateBrokerFee(Account[] accounts) {
		double totalFee = CalculateBrokerFee.calculateTotalFee(accounts);
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
