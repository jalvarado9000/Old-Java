package recursion;

public class Rec {

	
		public void Message(n){
		
			if(n > 0) {
		System.out.println("Callate la boca Gabriel");
		return Message(n-1);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ra = 5;
		Message(5);
		
		
	}
	
	

}
