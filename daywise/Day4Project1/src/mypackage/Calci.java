// pgm to execute arth calci function+-*/ four operator
package mypackage;
import java.util.Scanner;
public class Calci 
{

	public static void main(String[] args)
	{
		//variable declaration
				int ans, result=0,a,b;
				Scanner obj= new Scanner(System.in);
				boolean isValid=true;
				
				System.out.println("Calculator Menu:");
				System.out.println("1.Addition");
				System.out.println("2.Multiplication");
				System.out.println("3.Subtraction");
				System.out.println("4.Division");
				System.out.println("Enter ur choice:");
				ans= obj.nextInt();//enter ur choice
				
				//Read the number from user
				System.out.println("ENTER FIRST NUMBER:");
			    a=obj.nextInt();
			    System.out.println("ENTER Second NUMBER:");
			    b=obj.nextInt();
// can use if else condition for this if ans==1
//			    if(ans==1)
//			    	result=a+b;
//			    else if(ans==2)
//			    	result=a*b;
//			    else if(ans==3)
//			    	result=a-b;
//			    else if(ans==4)
//			    	result=a/b;
//			    else
//			    	isValid=false;
// but ths is slow process			    
			    switch(ans)
				{
					case 1:result=a+b;
						break;
					case 2:result=a*b;	
						break;
					case 3:result=a-b;
						break;
					case 4:result=a/b;
						break;
					default:
						isValid=false;
					
				}
			    	if(isValid)
			    		System.out.println("Result:" +result);
			    	else
			    		System.out.println("XXX:Invalid Option");
				

	}

}
