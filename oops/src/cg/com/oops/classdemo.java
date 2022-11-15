package cg.com.oops;

import java.util.Scanner;

public class classdemo {
	//Class->> A Class is a template or blueprint that is used to create objects
	//A class consists of data members and methods
	//Syntax:- 1
//	         public clas class_name
//	         {
//		          data members;
//		          Methods;
//	         }
	//Example:- 1
//	              public class car
//	              {
//		              public;
//		              double color;
//		              double model;
//	              }


            int x;
	public static void main(String[] args) {
		classdemo myObj1= new classdemo();
		classdemo myObj2= new classdemo();
		myObj1.x=  80;
		myObj2.x = 55;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);

	}

}
