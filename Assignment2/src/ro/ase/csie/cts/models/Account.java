package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.NegativeAccountValueException;
import ro.ase.csie.cts.exceptions.NegativeDaysActiveException;
import ro.ase.csie.cts.exceptions.NegativeRateException;

public class Account implements RateInterface{
	public double loanValue;
	public double rate;
	public int daysActive;
	public AccountType accountType;
	

	//getters
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
	
	@Override
	public double getMonthlyRate() {
		return loanValue * rate;
	}

	//should use string builder
	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType;
	}

	//compute the broker fee
	//Accounts class should not be responsible to calculate the fee for ALL accounts, but only for itself
	public static double calculateBrokerFee(Account[] accounts) {
		double totalFee = CalculateBrokerFee.calculateTotalFee(accounts);
		return totalFee;
	}

	//constructor with params
	public Account(double loanValue, double rate, AccountType accountType, int daysActive)
			throws NegativeAccountValueException, NegativeRateException, NegativeDaysActiveException {
		setLoanValue(loanValue);
		setRate(rate);
		this.accountType = accountType;
		setDaysActive(daysActive);
	}

}
