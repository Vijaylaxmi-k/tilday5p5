package mypackage;

public class MyClass {

	public static void main(String[] args) 
	{
		//  create obj for mathematics-outer class
		Maths1 M= new Maths1();
	
		//  create obj for algebra-inner class
		Maths1.subz s = M.new subz();
		
		System.out.println(s.CA(5, 2));
		System.out.println(s.CRA(10, 7));
		
		

	}

}
