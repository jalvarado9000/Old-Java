package bankAccountTest2;
import java.util.ArrayList;
import java.util.Scanner;


import bankAccountTest2.BankAccountTest;
import bankAccountTest2.BankAccountTest;
public class BankAccountManagement {
	
	private String first_name;
	
	private double new_deposit;
	private int SSN;
	private ArrayList<BankAccountTest> bAccList = new ArrayList<BankAccountTest>();
	
	
	void showMenu() {
		int op1;
		
		
		BankAccountTest obj1 = new BankAccountTest("Juan P Del Pueblo", 1000.2, 1234); 
		BankAccountTest obj2 = new BankAccountTest("Juan P Del Pueblo1", 500.3, 1244); 
		BankAccountTest obj3 = new BankAccountTest("Juan P Del Pueblo2", 200.9, 1254); 
		
		 
		bAccList.add(obj1);
		bAccList.add(obj2);
		bAccList.add(obj3);
		
		
		
		
		do {
		System.out.println("Press 1 to Create a account");
		System.out.println("Press 2 remove account");
		System.out.println("Press 3 view account");
		System.out.println("Press 4 to deposit");
		System.out.println("Press 5 to withdraw");
		System.out.println("Press 0 to exit program");
		Scanner input = new Scanner(System.in);
		
		op1 = input.nextInt();
		
			
			switch(op1) {
			
			case 1: 
				create();
				break;
			case 2:
				remove();
				break;
			case 3:
				AnalyseArray();
				break;
			case 4:
				new_deposit();
				break;
			case 5:
				new_withdraw();
				break;
				
			default:
				System.out.println("The number "  + op1 + " you have pressed is not on the menu");
				
			}	
			
			}while(op1 != 0);	
		}
	
		

		void create() {
			
			String first_name, middle_name, last_name;
			int SSN;
			double new_deposit;
			boolean bool = false;
			Scanner input = new Scanner(System.in);
			
			System.out.println("what is your Full name");
			first_name = input.nextLine();
			
			
			do {
			System.out.println("what the last 4 digits of your SSN?");
			SSN = input.nextInt();
			
			
			if(SSN > 1000 && SSN < 9999) 
				bool = true;
			
			else {
				bool = false;
				System.out.println("the number you have eneterd is incorrect");
			}
			}while(bool != true);
			
			do {
			System.out.println("Please deposit a a amount");
			new_deposit = input.nextDouble();
			
			
				if(new_deposit <= 0) {
					System.out.println("Your have not deposited a correct amount of money");
					bool = false;
				}
				
				else {bool = true;}
				
				}while(bool !=true);
			
			BankAccountTest obj1 = new BankAccountTest(first_name,new_deposit,SSN );
			bAccList.add(obj1);			
			
		}
		
		double get_newBalance() {return new_deposit;}
		
		String get_firstName(){return first_name;}
		
		int get_SSN() {return SSN;}
		
		
		
		
		
		
		
		public void remove() {
			
			 int position;
			 boolean bool = true;
			do{

		     {
			 Scanner keyword = new Scanner(System.in); String decide = "";
		     System.out.println("What is your SSN?: ");
		     int SSecurityN;
		     
		     SSecurityN = keyword.nextInt();

		    
		    
		     for(int i = 0; i< bAccList.size(); i++) {
		    
		     if (bAccList.get(i).get_SocialSecN() == SSecurityN) {

		    position = i;
		    System.out.println("Account User name: " + bAccList.get(position).getName());
			 System.out.println("Your last 4 digits of your social security number is: " + bAccList.get(position).get_SocialSecN());
			 System.out.println("Your balance is: " + bAccList.get(position).getBalance());
			 do
			 {
			 System.out.println("Delete this account? (y/n)");
			 decide = keyword.nextLine();
			 if(decide.equals("y"))
			 {
				 bAccList.remove(position);
				 return;
			 }
			 else if(decide.equals("n"))
			 {
				 return;
			 }
			 else
			 {
				 System.out.println("INVALID");
			 }
			 }
			 while(!decide.equals("n") || decide.equals("y"));
		     }

		     else 
		    System.out.print("Account not found ");
			bool = false;
		     }
		     } 
			
		}while(bool !=false);
			
			
		}
			
		
		void new_deposit() {
			boolean bool = true;
			Scanner input = new Scanner(System.in);
			int SSecurityN,position;
			double depo;
			System.out.println("enter your Social Security number");
			SSecurityN = input.nextInt();
			
			
			for(int i = 0; i< bAccList.size(); i++) {
			    
			     if (bAccList.get(i).get_SocialSecN() == SSecurityN) {

			    position = i;
			     bool = true;
			     System.out.println("How much do you wish to deposit");
			     depo = input.nextDouble();
			     bAccList.get(position).deposit(depo);
			     }

			     else 
			    System.out.print("Account not found ");
				bool = false;
			     }
			     } 
		
		

		void new_withdraw() {
			boolean bool = true;
			Scanner input = new Scanner(System.in);
			int SSecurityN,position;
			double draw;
			System.out.println("enter your Social Security number");
			SSecurityN = input.nextInt();
			
			
			for(int i = 0; i< bAccList.size(); i++) {
			    
			     if (bAccList.get(i).get_SocialSecN() == SSecurityN) {

			    position = i;
			     bool = true;
			     System.out.println("How much do you wish to withdraw");
			     draw = input.nextDouble();
			     
			     if(bAccList.get(position).getBalance() > draw ) {
			    	 
			    	 bAccList.get(position).withdraw(draw);
			     }
			     
			     else 
			    	 System.out.println("You dont have that certain amount");
			    	 
			     }
			     else 
			    System.out.print("Account not found ");
				bool = false;
			     }
			     } 

			
			
			
			
		
	
			void AnalyseArray(){
				
			
			Scanner input = new Scanner(System.in);
			int SSecurityN,position = 0;
			
			String confirm = " ";
			char letter = ' ';
			
			System.out.println("enter your Social Security number");
			SSecurityN = input.nextInt();
			
			
				
			
			for(int i = 0; i< bAccList.size(); i++) {
			
			     if (bAccList.get(i).get_SocialSecN() == SSecurityN)
			     {
					position = i;
					 System.out.println("Account User name: " + bAccList.get(position).getName());
					 System.out.println("Your last 4 digits of your social security number is: " + bAccList.get(position).get_SocialSecN());
					 System.out.println("Your balance is: " + bAccList.get(position).getBalance());
					 return;
			     }

			}
		    System.out.print("Account not found ");
		    return;
}
}

		
		

