//al algebra function add factorial pow sub etc
package Pakage4;

public class Algebra 
{	
	
		public int add(int a, int b)
		{
		return a+b;
		}
	
		public int factorial(int n)
		{
			int i=1, fact=1; 
			for(i=1;i<=n;i++)
				fact=fact*i;
			return fact;
				
		}
		
		public int mul(int a, int b)
		{
			return a*b;
		}
		
		public int power(int a, int b)
		{
			int i, result=1;
			for(i=1; i<=b; i++)
				result=result*a;
	     		return result;
		}

	

}
