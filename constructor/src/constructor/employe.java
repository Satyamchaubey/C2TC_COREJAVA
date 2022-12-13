package constructor;

public class employe {
	int id;
	String name;
	float salary;
	employe(int id, String name, float salary)
	{
		System.out.println("user defined no-argument" + "contructor executed");
	}
	void display() {
		System.out.println( id + "" + name + "" + "salary");
	}

}

