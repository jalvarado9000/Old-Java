package bankAccountTest2;

import java.util.ArrayList;
import bankAccountTest2.BankAccountManagement;
public class BankAccountTest {

	private String ownerName;
	private double balance;
	private double InterestRate;//interestRate
	private double interestAmnt; //holds total amount of interest earn for the account
	private int SocialSecN;
	
	
	
	
	//constructor for the name and balance

	public BankAccountTest(String n, double b, int ssc){

	ownerName = n;
	balance = b;
	SocialSecN = ssc;
	InterestRate = 0.012;
	}
	

	
	//Calculation
	void deposit(double amount){

		balance += amount;
		}
	
	
	void withdraw(double amount){
		if(amount < balance)
		balance -= amount;
		
	else
		System.out.println("You dont have that amount");
	}
	
	void addMonthlyInterest() {
		
		double t= 0;
		t = InterestRate*balance;
		balance +=t;
		interestAmnt +=t;
	}
	
	//Setter
	void setInterestRate(double ir ) {InterestRate = ir;}

	
	//Getter
	double getInterstAmnt() {return interestAmnt;}
	
	double getInterestRate() {return InterestRate;}
	
	double getMonthlyInterestRate(){return InterestRate/12;}

	double getBalance() {return balance;}
	
	String getName(){return ownerName;}
	
	int get_SocialSecN() {return SocialSecN;}
	
	
	
	
	}
