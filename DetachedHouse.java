package cityPlanning;

/*
Program Name: DetachedHouse.java
	Author: Ming
	Date: Jun. 8, 2019 8:02:53 p.m.
Description: create class based on UML class diagram 
*/
public class DetachedHouse extends Residential
{
	//create variable based on UML class diagram 
	private short numGarageSpots;
	//constructor
	public DetachedHouse(char type,double length, double width, short numFloor, short numRooms, short numBaths, short numBeds,short numGarageSpots)
	{
		super(type,length, width, numFloor, numRooms, numBaths, numBeds);// call Residential constructor
		this.numGarageSpots=numGarageSpots;
	}
	public boolean hasGarage() 
	{
		return this.numGarageSpots > 0;
	} 
	public String toString()
	{
		if(hasGarage())
			return super.toString()+"Garages : "+this.numGarageSpots;
		else
			return super.toString();
	}

}
