package cityPlanning;

/*
Program Name: building.java
	Author: Ming
	Date: Jun. 1, 2019 1:25:27 a.m.
Description: create class based on UML class diagram 
*/
public abstract class  Building
{
	// create variable based on UML class diagram
	private double length;
	private double width;
	public short numFloors;
	private char type;
	
	//constructor
	public Building(char type ,double length,double width,short numFloors) 
	{
		this.type=type;
		this.length=length;
		this.width=width;
		this.numFloors=numFloors;
	}
	
	public double getArea()// calculate area
	{
		// area = length * width *numFloor
		double area=this.length*this.width*this.numFloors;
		return area;
	}
	public String toString()// output
	{
		// Function is a class contain many function to use for coding purpose
		return Function.space(Function.getTypeOfBuilding(this.type),"(DetachedHouse")+  // Function.Space is use for format out put
				"("+ Function.getTypeOfBuilding(this.type)+")  area = "+this.getArea()+" sq.m "+
				Function.space((Double.toString(this.getArea())),"100000000")+" Floors = "+this.numFloors+Function.space(Short.toString(this.numFloors), "100");
		
	}
	public abstract double getTaxes();
}
