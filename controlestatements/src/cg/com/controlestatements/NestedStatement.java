package cg.com.controlestatements;

public class NestedStatement {

	public static void main(String[] args) {
		String lang = "Java";
		if(lang=="HLL & IL") {
			if(lang=="python")
			System.out.println("language is python");
		}
		else if(lang=="c++") {
			System.out.println("lang is c++");
		}
		else if(lang == "java") {
			System.out.println(lang);
		}

	}

}
