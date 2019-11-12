package cityPlanning;

/*
Program Name: Food.java
	Author: Ming
	Date: Jun. 1, 2019 2:16:28 a.m.
Description: create class based on UML class diagram 
*/
public class Food extends Commercial
{
	//constructor
	public Food(char type,double length, double width, short numFloor, short numUnits)
	{
		super(type,length, width, numFloor, numUnits);	//call Commercial constructor

	}

	public double getTaxes()
	{
		return (super.getTaxes()+100);//Food taxes= Commercial taxes+100
		
	}
}
