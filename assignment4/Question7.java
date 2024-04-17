/*7.Write a program to split a string containing 
two words using StringTokenizer without using hasMoreTokens() method and call nextToken() method three times.
Add an exception handling block if necessary.*/



package assignment4;

import java.util.StringTokenizer;

public class Question7 {

	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("Hello World ");
		try {
			String Token1= st.nextToken();
			System.out.println(Token1);
			String Token2=st.nextToken();
			System.out.println(Token2);
			String Token3= st.nextToken();
			System.out.println(Token3);
			
			
		}catch(Exception e)
		{
			System.out.println("There are no additional tokens to show...");
			System.out.println(e.getMessage());
		}
		
		
		
	}



	}


