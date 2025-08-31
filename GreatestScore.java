/*Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score.*/



import java.util.Scanner;  // Import Scanner class for user input
public class GreatestScore
{

    public static void main(String args[])
	{
	  //create scanner to take input from user
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter test score for Test 1: ");
	  int test1=sc.nextInt();
	  
	  System.out.println("Enter test score for Test2: ");
	  int test2=sc.nextInt();
	  
	  if(test1>test2)
	  {
	     System.out.println("Test 1 has lower score ");
	  }
	  else
	   {
	     System.out.println("Test 2 has higher score ");
	   }
	
	}

}