//pgm for hashset instead of arrayList
// it will not arrange array in order
package mypackage;

import java.util.HashSet;

public class Hashsetpgm 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> data= new HashSet<Integer>();// it will not consider duplicate values
		data.add(56);
		data.add(47);
		data.add(56);
		data.add(25);
		for (int d:data)
			System.out.println(d);// o/p : 56 25 47
	}

}
