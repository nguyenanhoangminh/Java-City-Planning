package cityPlanning;

/*
Program Name: Office.java
	Author: Ming
	Date: Jun. 1, 2019 2:14:59 a.m.
Description: create class based on UML class diagram 
*/
public class Office extends Commercial
{
	//constructor 
	public Office(char type,double length, double width, short numFloor, short numUnits)
	{
		super(type,length, width, numFloor, numUnits);	//call Commercial constructor 

	}


}
