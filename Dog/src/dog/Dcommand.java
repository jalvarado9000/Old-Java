package dog;

public class Dcommand {

	
	private String name;
	private int age;
	
	public Dcommand(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void speaks() {
		System.out.println("I am " + this.name + " and I am " + this.age);
	}
}
