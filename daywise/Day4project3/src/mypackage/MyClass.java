package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	
	{
		Employee emp= new Employee();
		emp.readData();
		emp.printData();	
	}
}
class Employee
	{
		private String name;
		private int salary;
		private int age;
		
		public void readData()
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("enter name:");
			name= obj.next();
			System.out.println("enter salary:");
			salary=obj.nextInt();
			System.out.println("enter age:");
			age=obj.nextInt();
			obj.close();
		
		}
		public void printData()
		{
			System.out.println("NAME:" +name);
			System.out.println("Salary:" +salary);
			System.out.println("AGE:" +age);
		}
		//Scanner obj= new Scanner(System.in)
		
	}
	
	


