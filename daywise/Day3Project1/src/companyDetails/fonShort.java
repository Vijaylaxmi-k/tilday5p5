// pgm to find factorial of no. using function
package companyDetails;

//import java.util.Scanner;

public class fonShort 
{
								//function definition 
//factorial is a ftn name and parameters are "i" and "fact"
// int in the next line is return date type
	static int factorial(int n)
    {
								//ftn body
	       int i, fact=1;
		   for(i=1;i<=n;i++)
		       fact=fact*i;
		   return fact;		   	
    }
	                              //ftn bdy
        
								//function def	

	public static void main(String[] args) 
           
	{
		 int n=4,n1=5,n2=6;
		System.out.println(factorial (n));
		System.out.println(factorial (n1));
		System.out.println(factorial (n2));
		
	}

}
 