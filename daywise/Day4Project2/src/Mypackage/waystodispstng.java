//pgm for displaying string in 3 ways
package Mypackage;

public class waystodispstng 
{

	public static void main(String[] args) 
	{
		int[] data= {4,5,6,7};
//		for(int i=0;i<=4;i++)//way-1 college fresher
//			System.out.println(data[i]);

//		for(int i=0;i<=data.length;i++)//way-2 trained person
//			System.out.println(data[i]);
		
//		for(int d:data)//way-3 1 yrs exp
//			System.out.println(data[i]);
// when data type changes Var automatically it will update based in data type		
		for(var d:data)//way-4 +3-4 years experience use this code
			System.out.println(d);
	}

}
