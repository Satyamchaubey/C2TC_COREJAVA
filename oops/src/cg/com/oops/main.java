package cg.com.oops;

public class main {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s1.insertRecord(111, "rahul");
		s2.insertRecord(647, "satyam");
		s1.displayInformation();
		s2.displayInformation();

	}

}
