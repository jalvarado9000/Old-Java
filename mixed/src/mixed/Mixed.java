package mixed;

public class Mixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short firstNumber = 10;
		short secondNumber = 20;
		
		int  thirdNumber;
		
		String name = "ricky";
		
		thirdNumber = (firstNumber + secondNumber);
		//or
		thirdNumber = (short)(firstNumber + secondNumber);
		
		System.out.println(thirdNumber + name);
		System.out.print(name);

	}

}
