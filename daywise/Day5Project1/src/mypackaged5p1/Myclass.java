package mypackaged5p1;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= new int[5];
		
		
		for(int i=0;i<5;i++)
			System.out.println(data[i]);
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		for(int d:data)
			System.out.println(data[d]);
		
		for(var d: data)
			System.out.println(data[d]);
		
	}

}
