//exception handling
package exptHandling1;

import java.util.Scanner;

public class expt1 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter no.");
		n=obj.nextInt();
		for (int i=0;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
		obj.next();
	}

}
