package cityPlanning;
import java.text.DecimalFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Program Name: RetailCityInfo.java
	Author: Ming
	Date: Jun. 9, 2019 12:58:20 a.m.
Description: Create report of city 
*/
public class CityInfo
{
			public static void main(String[] args) throws FileNotFoundException 
			{
			// create Scanner object 
			Scanner input = new Scanner(System.in);

			ArrayList<Building> city = new ArrayList<>();// array list to store building structure

			// user can input file name that already imported in the root file or user can input the path of the file
			System.out.print("Enter the name of the city file: ");
			String fileName = input.next();

			
			String path = "";// store the path of the file
			path += fileName;

			// close scanner
			input.close();

			// Create File object represents the file
			File inputFile = new File(path);
			// Create another Scanner object to scan file content
			// This creation throws exception
			Scanner fileReader = new Scanner(inputFile);

			// Main loop
			String fileData;
			
			while (fileReader.hasNextLine()) // read all the file
			{
				fileData = fileReader.nextLine().trim().toUpperCase();
				// if this line is empty, skip this line 
				if (fileData.isEmpty())
				{
					continue;
				}
				Building structure = Function.structure(fileData);// Initialize structure
				
				// store each building structure to array list
				city.add(structure);
			}

			// output the report
			report(city);
			// Close the file scanner
			fileReader.close();
		}
			
			
		public static void report(ArrayList<Building> city) //output the report
		{
			// variable for report
			int countTallBuilding=0;
			int countProperties=0;
			int countTotalHouse=0;
			double totalHouseSize=0;
		  double residentialTax=0;
			double CommercialTax=0;
			int countHouseHasGarage=0;
			int countDetachedHouse=0;
			int countHousingUnits=0;
			System.out.println();
			
			// output
			for (Building each : city) 
			{
				//1st part
				System.out.println(each.toString());
				countProperties++; // each building is one Properties

				// building have more than 6 floor is tall building
				if(each.numFloors>6)
					countTallBuilding++;
				
				if (each instanceof Apartment) 
					countHousingUnits += ((Apartment) each).numUnits ;// count the number of units of all Apartment
				if(each instanceof Commercial)
				{
					CommercialTax+=each.getTaxes(); // calculate Commercial taxes
				}
				if(each instanceof Residential)
				{
					countHousingUnits++; // each Residential is one house unit
					totalHouseSize+=each.getArea(); // each residential is a house
					countTotalHouse++; // each residential is a house
					residentialTax+=each.getTaxes();// calculate Residential taxes
				}
				if(each instanceof DetachedHouse)
				{
					countDetachedHouse++; // count number of Detached House
					if(((DetachedHouse) each).hasGarage())
						countHouseHasGarage++; // count number of Detached House that has Garage
				}
			}
			
			//2nd part
			System.out.println("\n\nNumber of properties = "+countProperties);
			System.out.println("Number of tall buildings = "+countTallBuilding);
			//3rd part
			System.out.println("\n\nAverage house size = " + Function.roundToOneDecimalPlace((totalHouseSize/countTotalHouse)) + " sq.m"); // Average house size = total House Size / Total House number
			System.out.println("Total # housing units = "+countHousingUnits+" units");
			System.out.println("Percentage of houses with garages = "+Function.roundToOneDecimalPlace((double)(countHouseHasGarage)/countDetachedHouse*100)+"%");// percentage = number of Detached House that has Garage/number of Detached House

			// 4th part
      DecimalFormat decimalFormat = new DecimalFormat("0.0"); // format output taxes
			System.out.println("\n\nResidential taxes = $"+String.valueOf(Function.roundToOneDecimalPlace(residentialTax)));
			System.out.println("Commercial taxes = $"+decimalFormat.format(Function.roundToOneDecimalPlace(CommercialTax)));
			System.out.println("Total taxes = $"+ decimalFormat.format(Function.roundToOneDecimalPlace(CommercialTax+residentialTax))); // total taxes =Commercial Tax +residentialTax



	}

}
