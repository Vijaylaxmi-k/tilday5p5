// pgm to declare array nd read 5 no. from user and print sum and average
//		data[0]=1;data[1]=2;data[2]=3;data[3]=4;data[4]=5;//can initialize this way
package Mypackage;
import java.util.Scanner;
public class MyClass 
{
	public static void main(String[] args) 
	{
		// dec array
		int MAX=5;
		int[] data= new int[MAX];
		int sum=0, average;
		Scanner obj = new Scanner(System.in);
		
		
		// read no. from user
		for (int i=0;i<MAX;i++)
		{
			System.out.println("enter any number:");
			data[i]=obj.nextInt();
		}
		//find sum
		for(var d:data)
			     sum=sum+d;//sum+=d;
		//find average
		average=sum/MAX;
		
		System.out.println("sum =" +sum);
		System.out.println("average =" +average);	

	}
	
}
