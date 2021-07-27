// pgm for inheritance that is  reusing base class method in derived class
package Pakage4;

public class Exofinhertance 
{
 public static void main(String[] args) 
 {
	Totalmaths obj= new Totalmaths();
	System.out.println("subtraction of number:"+obj.subtraction(5,4));
	System.out.println("factorial of number:"+obj.factorial(4));
	System.out.println("multiplication of number is:" +obj.mul(5, 6));
	System.out.println("power of number is:"+obj.power(5, 2));
 }
}