/*4.Write a Java method to check if an input string is a palindrome 
(Use String functions).*/


package assignment4;

public class Question4 {
	public static void main(String[] args) {

	String input1 = "radar";



    String input2 = "hello";

 System.out.println(input1 + " is a palindrome: " + isPalindrome(input1));



    System.out.println(input2 + " is a palindrome: " + isPalindrome(input2));



}



public static boolean isPalindrome(String str) {



    str = str.toLowerCase();



    str = str.replaceAll("[^a-z0-9]", "");



    return str.equals(new StringBuilder(str).reverse().toString());



}



}
