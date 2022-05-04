package date10;


		
		import java.util.Scanner;


		public class Ejercicio10 {



		   public static void main(String[] args) {

		   

		   

		 

		       System.out.print("Enter a number: ");

		       

		       Scanner input = new Scanner(System.in);

		       

		       double num = input.nextDouble();

		     

		  double sumEven = 0;

		     for(int i=2; i< num; num ++) {  

		            

		         if (num % 2 == 0) {  

		         

		         sumEven += num;

		         

		            System.out.println("Display even number:" + i++) ;  

		         }

		         else {                

		            System.out.println("Please try again");    

		         }

		          

		      

		     

		 

		     }

		     

	}

}
