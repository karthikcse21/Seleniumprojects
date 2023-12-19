package org.javaclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Java_String {

	public  void strmtd() {
		System.out.println("Test");
		ArrayList<String> student = new ArrayList<String>();
		student.add("divi");
		student.add("sindhu");
		student.add("bhuttu");
		student.add("bhuttu");
		
		System.out.println("arraylist" +student);
		
		//remove duplicates
		Set<String> set = new HashSet<String>(student);
		student.clear();
		student.addAll(set);
	
		System.out.println("Removed duplicates" +student);
		
	}
}
