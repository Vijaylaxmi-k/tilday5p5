//pgm for arraylist
package mypackage;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> data= new ArrayList<Integer>();// will consider dup values
		data.add(56);
		data.add(47);
		data.add(56);
		data.add(25);
		
		System.out.println(data.size());// o/p=4
		System.out.println(data);//o/p= [56, 47, 56, 25]
	}

}
