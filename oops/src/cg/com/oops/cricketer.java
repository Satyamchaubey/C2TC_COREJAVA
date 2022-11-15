package cg.com.oops;

public class cricketer{
	String name = "Dhoni";
	int age = 38;
	String color = "blue";
	String role = "Batsman";
	String nationality = "Indian";
	void display() {
		System.out.println("I Love Cricket");
	}

	public static void main(String[] args) {
		System.out.println("your fav game:-");
		cricketer c = new cricketer();
		c.display();
		System.out.println("main method ended");
		
	}

}
