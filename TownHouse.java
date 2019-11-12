package cityPlanning;

/*
Program Name: TownHouse.java
	Author: Ming
	Date: Jun. 1, 2019 2:13:32 a.m.
Description: create class based on UML class diagram 
*/
public class TownHouse extends Residential
{
	//constructor
	public TownHouse(char type,double length, double width, short numFloor, short numRooms, short numBaths,
			short numBeds)
	{
		super(type,length, width, numFloor, numRooms, numBaths, numBeds); // call Building constructor
	}

}
