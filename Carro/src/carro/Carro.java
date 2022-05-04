package carro;
import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		    //declaracion de variable

		//String tamano;
		//int millaje, tanque, rendimiento;
		int type_car;
		
		  Scanner input1 = new Scanner(System.in);
		  
		  Impuesto obj1;
		  obj1 = new Impuesto();
		  obj1.print_Opciones();
		  
		  type_car = input1.nextInt();
		  obj1.Opciones(type_car);
		  
		  
	}
}
		/*

		    //metodo del auto

		    //calcular milla por tanque

		    public String model(int input1, String input2){

		        nombre = input1;

		        tamano = input2;

		        return nombre;

		    } 

		    public int calcular(int input3, int input4){

		        rendimiento = input3 / input4;

		        return rendimiento;

		    } 

		    public void display(String nombre, int rendimiento){

		        System.out.println("El modelo del auto es: "+nombre+ " Tamaño : "+tamano+" y el rendimiento es : "+rendimiento + " M.P.G.");

		        

		    

		       

		    }        
		
		
		
		
		
		
		
		
		

	}

}
*/
