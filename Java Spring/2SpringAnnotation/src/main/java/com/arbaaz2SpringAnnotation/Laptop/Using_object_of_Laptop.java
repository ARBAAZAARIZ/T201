package com.arbaaz2SpringAnnotation.Laptop;

import org.springframework.beans.factory.annotation.Autowired;

public class Using_object_of_Laptop {
	@Autowired
	Ram r;
	@Autowired
	HardDisk h;
	
	Laptop firstObjectLaptop(){
		return new Laptop(r,h);
	}

}
