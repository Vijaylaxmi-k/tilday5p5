//pgm to Read something from user like name and number display it 
// we study here to import scanner java util and 
//declaring data types are studied here
//usage of scanner, next(), nextline()
package companyDetails;
import java.util.Scanner;
public class readAndDisplay {

		
		public static void main(String[] args) 
		{		
			//variable declaration
			String name;
			int age;
			float height;
			
			//read data from user
			Scanner obj= new Scanner(System.in);
			//should import util package from scanner 
			//so just place mouse on scanner than a window will pop
			//up than just import java.util package
							
			System.out.println("Enter your name:");
			name=obj.nextLine();
			//name=obj.next();
			
			System.out.println("Enter your age:");
			age=obj.nextInt();
			

			System.out.println("Enter your height:");
			height=obj.nextFloat();
			
			obj.close();
			System.out.println("your name is:" +name);
			System.out.println("your name is:" +age);
			System.out.println("your name is:" +height);
		}

	}
