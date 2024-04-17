/*6.Create an integer array of size n and read 
the elements from the user .Add an exception handling block to 
print the value at nth position of the array*/


package assignment4;
import java.util.Scanner;
public class Question6 {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			try {
			System.out.println("Enter the index position");
			int position = sc.nextInt();
			System.out.println("Value for index" + position + "is :" + arr[position]);
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid index position");
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}

	}

}
