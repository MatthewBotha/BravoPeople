package bravopeople;/*
	Author: Mpho Baloyi 
	Student Number: 14133670
	Group Name: Bravo-People
	
	This file defines the Organization Class for the Researcher Support System (RSS).
*/

class Organisation
{
	String name;
	//String ID;
	
	Organisation()
	{
		name="Organisation";
	}
	
	Organisation(String organisation_name)
	{
		name = organisation_name;
	}
	
	public void setName(String name)
	{}
		
	public String getName()
	{
		return name;
	}
}