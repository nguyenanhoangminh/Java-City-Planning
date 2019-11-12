package cityPlanning;

/*
Program Name: Commercial.java
	Author: Ming
	Date: Jun. 1, 2019 1:59:02 a.m.
Description: create class based on UML class diagram 
*/
public abstract class Commercial extends Building
{
	// create variable based on UML class diagram
	public short numUnits;
	//constructor
	public Commercial(char type,double length,double width,short numFloor,short numUnits)
	{
		super(type,length, width, numFloor); // call Building constructor
		this.numUnits = numUnits;
	}
	public double getTaxes()
	{
		return super.getArea()*15;// taxes = area *15
	}
	public String toString()// output
	{
		return super.toString()+" Units: "+this.numUnits;		
	}
}
