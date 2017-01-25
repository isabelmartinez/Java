package org.foobarspam.bisiesto;

public class Year {

	private int year = 0;
	
	public Year(int year){
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}

	public boolean esBisiesto(){
		return (year % 4 == 0  &&  (year % 100 != 0  ||  year % 400 == 0));
	}

}