package exptHandling1;

import java.util.Scanner;

public class Expt2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 1st No.");
		a=obj.nextInt();
		System.out.println("enter 2nd No.");
		b=obj.nextInt();
		c=a/b;
		System.out.println("ans="+c);
		obj.next();
		obj.close();
	}
}
