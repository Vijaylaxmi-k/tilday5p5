//pgm for treeset 
// it will arrange array in order
package mypackage;
import java.util.TreeSet;

public class Treeset1 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> data= new TreeSet<Integer>();// it will not consider duplicate values
		data.add(56);
		data.add(47);
		data.add(56);
		data.add(25);
		for (int d:data)
			System.out.println(d);// o/p : 25 47 56

	}

}
