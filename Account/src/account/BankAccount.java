package account;

public class BankAccount {
	//Private members
	private String ownerName;
	private double interestRate;
	private double interestAmnt;
	private double balance;
	
	//Constructors
	public BankAccount(String o, double b, double ir) {
		ownerName = o;
		balance = b;
		interestRate = ir;		
		}
	
	public BankAccount(String o, double b){
		ownerName = o;
		balance = b;
		interestRate = 0.012;		
	}
	
	public BankAccount(String o){
		ownerName = o;
		balance = 0.0;
		interestRate = 0.012;	
	}
	
	//Calculation
public void deposit(double amount) {
	balance=+amount;
}
	
public void withdraw(double amount) {
	balance=-amount;
}
	
public void addMonthlyInterest() {
	
	double mInterest = balance*interestRate;
	
	
}

	//Setter

public double getInterestAmnt() {
	return interestAmnt;
}

public double getInterestRatet() {
	return interestRate;
}

public double getMonthlyInterestRate() {
	
	return balance*interestRate;
}


public double getBalance() {
	
	return balance;
}


public void setInterestRate(double interestRate)
	

	
	
	
	
	
	
}
