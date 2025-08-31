/*Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number*/



import java.util.Scanner;  // Import Scanner class for user input
public class Locker
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter locker number: ");
	  int i=sc.nextInt();
	  
	  System.out.println((i%2==0)?"Even locker number":"Odd locker number");
	  sc.close();  // close
	}

}