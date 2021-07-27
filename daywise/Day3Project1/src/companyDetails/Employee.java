// how to call a method how to siplay common info with variable info
package companyDetails;

import java.util.Scanner;

public class Employee 
{
	public String name;
	public int age;
	public static String company="Microsoft";
	
	//readadata is a method
	public void readData()
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter name:");	
		name= obj.next();
		System.out.println("Enter age:");
		age= obj.nextInt();
		//obj.close();

		
	}
	public void printData()
	{
		System.out.println("your name is:" +name);
		System.out.println("your age is:" +age);
		System.out.println("company name is:" +company);
	}
	
}
