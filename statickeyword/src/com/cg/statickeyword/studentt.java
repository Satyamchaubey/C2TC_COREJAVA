package com.cg.statickeyword;

 class studentt {
	 int rollno;
	 String name;
	 static String college = "SIT";
	 studentt(int r, String n){
		 rollno = r;
		 name = n;
	 }
	 void display() {
		 System.out.println(rollno + " " + name + " " + college);
	 }
	public static void main(String[] args) {
		studentt s1 = new studentt(111,"karan");
		studentt s2 = new studentt(222,"aryan");
		studentt s3 = new studentt(111,"varan");
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
 
 
 
//          Java Static method
// 
// 
// 
// 
// package com.cg.statickeyword;
//
// class studentt {
//	 int rollno;
//	 String name;
//	 static String college = "SIT";
//	 studentt(int r, String n){
//		 rollno = r;
//		 name = n;
//	 }
//	    static void change() {
//	    	college = "BBDI";
//	    } 
//	 void display() {
//		 System.out.println(rollno + " " + name + " " + college);
//	 }
//	public static void main(String[] args) {
//		studentt s1 = new studentt(111,"karan");
//		studentt s2 = new studentt(222,"aryan");
//		studentt s3 = new studentt(111,"varan");
//		s1.display();
//		s2.display();
//		s3.display();
//		
//		
//
//	}
//
//}

 
 
 
 
 
 
 
 
 
 
 
