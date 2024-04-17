/*3.Write a Java program to concatenate all elements of
a string array efficiently using StringBuilder.*/


package assignment4;

public class Question3 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Ashwini");    
        StringBuilder s2 = new StringBuilder(" Java");     
        StringBuilder s = s1.append(s2);    
            System.out.println(s.toString());   
    }  

	}


