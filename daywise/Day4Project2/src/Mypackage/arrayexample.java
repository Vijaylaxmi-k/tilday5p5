//pgm on array and declaration of array
//declare array, name of array is data and length of array is 5
//(array of index if from zero to 4)
package Mypackage;

public class arrayexample 
{

	public static void main(String[] args) 
	{
//		int[] data= new int[5];//1)
//		for(int i=1;i<=5;i++)//never do this bcz when array size is reduced value of (data[i]) it will b pblm
		
		int[] data={4,5,6,7}; //2)we can declare like this also and preferable
//		for(int i=0;i<=data.length;i++)//2)

//		int[] data= new int[]{1,2,3,4,5};//3)we can declare like this also
			
		//	System.out.println(data[i]);
		
		for(int d:data)//using for each loop by considering element
			System.out.println(d);

	}

}
