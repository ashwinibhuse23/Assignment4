/*8.Write a JAVA program to create a method that takes 
a string as input and 
throws an exception if the string does not contain vowels.*/



package assignment4;
import java.util.Scanner;



	
		class NoVowels extends Exception{
			public NoVowels(String msg)
			{
				super(msg);
			}
		}

		public class Question8 { 
			public static void checkVowels(String input)throws NoVowels
			{
				boolean containsVowels=false;
				String vowel="AEIOUaeiou";
				for(int i=0;i<input.length();i++)
				{
					char test=input.charAt(i);
					if(vowel.contains(String.valueOf(test))) {
						containsVowels=true;
						break;
					}
				}
				if(!containsVowels)
				{
					throw new NoVowels("This string does not contains any vowels");
				}
			}

			public static void main(String[] args) {
				System.out.println("Enter the string");
				Scanner sc= new Scanner(System.in);
				try {
				String input=sc.next();
				checkVowels(input);
				System.out.println("The string contains Vowels....");

			}catch(NoVowels e)
				{
				System.out.println(e.getMessage());
				}

		}
		}


	


