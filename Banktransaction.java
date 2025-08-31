/*Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction.*/

import java.util.Scanner;  // Import Scanner class for user input
public class Banktransaction
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter transaction amount: ");
	  int deposit=sc.nextInt();
	 
	  
	  if(deposit>0)
	  {
	     System.out.println("Deposit transaction");
	  }
	   else 
	   {
           System.out.println("Withdrawal transaction.");
        }

	}

}