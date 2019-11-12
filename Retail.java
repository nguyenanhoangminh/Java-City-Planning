package cityPlanning;

/*
Program Name: Retail.java
	Author: Ming
	Date: Jun. 1, 2019 2:15:45 a.m.
Description: create class based on UML class diagram 
*/
public class Retail extends Commercial
{
	//constructor
	public Retail(char type,double length, double width, short numFloor, short numUnits)
	{
		super(type,length, width, numFloor, numUnits);	//call Commercial constructor

	}
	public double getTaxes()
	{
		return (super.getTaxes()+50*super.numUnits);// Retail taxes = Commercial taxes +50* units
		
	}
}
