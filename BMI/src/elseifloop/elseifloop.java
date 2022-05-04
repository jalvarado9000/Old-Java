package elseifloop;
import java.util.Scanner;

public class elseifloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner (System.in);


		int userNum;


		int mult , output;


		System.out.println("Enter a positive integer: ");

		userNum = input.nextInt();


		System.out.println("The list of factors are: ");

		for (int i = 1; i <= userNum; i++) 

		{

		mult = userNum+i;

		if (mult == 100) 

		{

		System.out.print(mult);



		} 
		else
		System.out.println("I will not print numbers beyond 100");

		} 

	}
		
		
		
		
	}


