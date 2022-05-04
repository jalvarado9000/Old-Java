package segundo;

import java.util.Scanner;

public class Segundo {

	
	
	
	
	public static void main(String[] args) 
	
		{
		
		int number,result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number");
		
		number = input.nextInt();
		
		if(number%2 == 0) {
		
		result = isMod(number);
		
			
		}
		
		
		else if(number%2 == 1) 
		{
		result = isOdd(number);
			
		}
		
		else {}
		}
		
	public static void onlyPrint(int total,int sum) 
	{
		
		int total1 = total/2;
		int x = 0;
		
		for(int z = 1; z <= total1; z++) 
		{
		x=+sum;
		System.out.print(x);
		}
		
		
	}
		
	
	public static void isPrime(int num,int i,int num1)
	{
			
			
				
					if(num == 0) 
					{
						
						int y = i;
						
						onlyPrint(num1,y);
						
						
					}
				
					else if (num == 1)
					{
						System.out.print("hello");
						
					
					}
						else {}
			   
	}
	
	 static int isMod(int num1)
	
	{
		
		for(int i = 1; i <= num1; i++) 
			
		{
			int result = i%2;
			
			
			isPrime(result,i,num1);
			
		
		}
		return num1;
		
	}
	
	 
	static int  isOdd(int num1)
	{
		
		for(int i = 1; i <=num1; i+=2) 
		{
		
		int result = i%2;
		
		isPrime2(result,i,num1);
				
				
		}
		return num1;
	}
	
	public static void isPrime2(int num,int i,int num1)
	{
			
			
				
					if(num == 1) 
					{
						
						int y = i;
						
						onlyPrint(num1,y);
						
						
					}
				
					else if (num == 0)
					{
						System.out.print("hello");
						
					
					}
						else {}
			   
	}
	
}
	

