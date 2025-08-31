/*Input:
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Output:
Company 2 offers the highest salary*/

import java.util.Scanner;  // Import Scanner class for user input
public class Highsalary
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter salary for Company 1: ");
	  int salary1=sc.nextInt();
	  
	  System.out.println("Enter salary for Company 2: ");
	  int salary2=sc.nextInt();
	  
	  System.out.println("Enter salary for Company 3: ");
	  int salary3=sc.nextInt();
	  
	  if((salary1>salary2)&&(salary1>salary3))
	  {
	     System.out.println("Company 1 offers the highest salary.");
	  }
	  else if((salary2>salary1)&&(salary2>salary3))
	   {
	     System.out.println("Company 2 offers the highest salary.");
	   }
	   else if((salary3>salary1)&&(salary3>salary2))
	   {
	     System.out.println("Company 3 offers the highest salary.");
	   }
	   else 
	   {
            // In case two or more companies offer equal highest salary
           System.out.println("Two or more companies offer the same highest salary.");
        }

	  
	
	
	}

}