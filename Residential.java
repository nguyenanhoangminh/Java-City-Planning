package cityPlanning;

/*
Program Name: Residential.java
	Author: Ming
	Date: Jun. 1, 2019 2:05:11 a.m.
Description: create class based on UML class diagram 
*/
public abstract class Residential extends Building
{
	// create variable based on UML class diagram
	private short numRooms;
	private short numBaths;
	private short numBeds;
	// constructor
	public Residential(char type, double length, double width, short numFloor,short numRooms,short numBaths,short numBeds)
	{
		super(type,length, width, numFloor);// call Building constructor
		this.numRooms=numRooms;
		this.numBaths=numBaths;
		this.numBeds=numBeds;
	}
		
		public double getTaxes()
		{
			return super.getArea()*20;// taxes= area *20
		}
		public String toString()//output
		{
			return super.toString()+" Rooms: "+this.numRooms+", Baths: "+this.numBaths+", Beds: "+this.numBeds+" ";		
		}

}
