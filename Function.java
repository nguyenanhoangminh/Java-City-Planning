package cityPlanning;

/*
Program Name: Function.java
	Author: Ming
	Date: Jun. 8, 2019 5:23:57 p.m.
Description:  contain many function to use for coding purpose
*/
public class Function
{
	public static double roundToOneDecimalPlace(double number) // round a double number to one decimal place
	{
		return Math.round(number * 10.0) / 10.0;
	}
	
//add space for format purpose
	public static String space(String format,String max)// string format is the input that need formatted and string max is string have max length
	{
		String spaceNum="";
		for (int i = 0; i < max.length() - format.length(); i++) 
		{
			spaceNum+=" " ;
		}
		return spaceNum;
	}
	// return full name of type Of Building
	public static String getTypeOfBuilding(char type)
	{
		switch (type)
		{
			case ('T'): 
			{
				return "Townhouse";
			}
			case ('D'): 
			{
				return  "DetachedHouse";
			
			}
			case ('A'):
			{
				return "Apartment";
			}
			case ('F'): 
			{
				return "Food";
			}
			case ('O'): 
			{
				return "Office";
			}
			case ('R'): 
			{
				return "Retail";
			}
		}
		return null;
		}
	// take the input and initialize building structure
	public static Building structure(String inputFile) 
	{
		String[] tokens = inputFile.split("\\s+");
		char type = inputFile.charAt(0);
		Building structure;
		switch(type) 
		{
			case 'T': 
			{
				
				structure = new TownHouse('T',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]), Short.parseShort(tokens[5]),
						Short.parseShort(tokens[6]));
			} 
			break;
			case 'D':
			{
				structure = new DetachedHouse ('D',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]), Short.parseShort(tokens[5]),
						Short.parseShort(tokens[6]),Short.parseShort(tokens[7]));
			} 
			break;
			case 'A': 
			{
				structure = new Apartment('A',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]), Short.parseShort(tokens[5]));
				
			}
			break;
			case 'F':
			{
				structure = new Food('F',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]));
			} 
			break;
			case 'O': 
			{
				structure = new Office('O',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]));
			}
			break;
			case 'R':
			{
				structure = new Retail('R',Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
						Short.parseShort(tokens[3]),Short.parseShort(tokens[4]));
			}
			break;
			default: structure=null;
		}
		return structure;
	
		}
	}





