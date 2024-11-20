package com.arbaaz2SpringAnnotation;



// parameterized constructor - giving control to spring to create object and to handle life cycle of object 
//but here in this class we cannot give so we will create new class and give permission

public class Project {
	
	String name;
	String duration;
	
	 Project(String projectName ,String projectDuration ){ 
		
		this.name=projectName;
		this.duration=projectDuration; 
		
		System.out.println("Project name : " + name);
		System.out.println("Project duration : " + duration);
		
	}
	 
	 int manPower () {
		 return 10;
	 }

	
	
    	

}
