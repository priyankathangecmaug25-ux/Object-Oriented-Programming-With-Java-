/* Leap Year Check (Ternary)
Input:
Enter year: 2024
Output:
2024 is a leap year.*/

import java.util.Scanner;  // Import Scanner class for user input
public class LeapyearTernary
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter Year: ");
	  int year=sc.nextInt();

	  System.out.println((year%4==0)&&(year%100!=0)||(year%400==0)? year+ " is a leap Year":year + " is a not leap Year");
	  sc.close();  // close
	}

}