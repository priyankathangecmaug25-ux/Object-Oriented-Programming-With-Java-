/*Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden*/

import java.util.Scanner;  // Import Scanner class for user input
public class Garden
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter length: ");
	  int l=sc.nextInt();
	  
	  System.out.println("Enter breadth:");
	  int b=sc.nextInt();
	  
	  System.out.println((l==b)?"Square garden":"rectangular garden");
	  sc.close();  // close
	}

}