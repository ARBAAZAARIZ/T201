package com.arbaaz2SpringAnnotation;

import org.springframework.stereotype.Component;


//  non parameterized constructor giving control to spring to create object and to handle life cycle of object
@Component
public class Employee {
	Employee(){
		System.out.println("Objected created of Employee class by IoC");
	}
	
	public void gettingEmpDetails() {
		System.out.println("Getting employeen details..............");
	}

}
