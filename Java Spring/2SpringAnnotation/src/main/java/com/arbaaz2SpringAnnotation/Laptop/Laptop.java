package com.arbaaz2SpringAnnotation.Laptop;




public class Laptop {
	
	Laptop(Ram ram, HardDisk hdd){	
		System.out.println("ram inserted sucessfully into Laptop --> "+ram.isRamInserted());
		System.out.println("HDD inserted sucessfully : --> " + hdd.isHddInserted());
	}
}
