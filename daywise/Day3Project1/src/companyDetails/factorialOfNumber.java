//pgm for factorial of number
package companyDetails;

public class factorialOfNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=4, i, n1=5, fact1=1, fact2=1 ;
		
		for(i=1;i<=n;i++)
		fact1=fact1*i;
		
		for(i=1;i<=n1;i++)
			fact2=fact2*i;
		
		System.out.println(fact1);
   		System.out.println(fact2);
	}

}
