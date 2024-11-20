package com.arbaaz2SpringAnnotation;


import org.springframework.stereotype.Component;

@Component
public class Using_Object_Created_By_IoC {
	
	
	Using_Object_Created_By_IoC(Employee e,Project p){
		
//		e=new Employee();
		e.gettingEmpDetails();
//		this.p=new Project("TATA","3 YEARS");
		System.out.println(" man power "+p.manPower());
	}

}
