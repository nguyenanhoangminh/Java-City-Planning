package cityPlanning;

/*
Program Name: Apartment.java
	Author: Ming
	Date: Jun. 9, 2019 1:57:33 a.m.
Description: create class based on UML class diagram 
*/
public class Apartment extends Commercial
{
	//create variable based on UML class diagram 
	private short numRented;
	//constructor
	public Apartment(char type, double length, double width, short numFloor, short numUnits,short numRented)
	{
		super(type, length, width, numFloor, numUnits);//call Commercial constructor
		this.numRented=numRented;
	}
	public String toString()
	{
		return super.toString()+" Occupied: "+numRented;
	}
	

}
