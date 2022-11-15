package com.cg.constructor;
class employee {
	int id;
	String name;
	float salary;
	employee(int id, String name, float salary)
	{
		System.out.println("user defined no-argument" + "contructor executed");
	}
	void display() {
		System.out.println( id + "" + name + "" + "salary");
	}
	

}

public class main {

	public static void main(String[] args) {
		employee e1 =new employee(100, "rahul" , 45000);
		employee e2 = new employee(200 , "dinesh" , 59599);
		employee e3 = new employee(200 , "dinesh" , 59599);
		
		e1.display();
		e2.display();
		e3.display();

	}

}
