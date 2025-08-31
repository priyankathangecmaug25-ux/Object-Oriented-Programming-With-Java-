/*Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3*/

import java.util.Scanner;  
class OldYoungFriend 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter age of Friend 1: ");
        int fri1 = sc.nextInt();
		
        System.out.print("Enter age of Friend 2: ");
        int fri2 = sc.nextInt();
		
		System.out.print("Enter age of Friend 3: ");
        int fri3 = sc.nextInt();
		
        switch(1)   //check old
		{
		   case 1:
		   if(fri1>fri2 && fri1>fri3)
		   {
		      System.out.println("Oldest: Friend 1");
			  break;
		   }
		   case 2:
		   if(fri2>fri1 && fri2>fri3)
		   {
		      System.out.println("Oldest: Friend 2");
			  break;
		   }
		   case 3:
		   if(fri3>fri1 && fri3>fri2)
		   {
		      System.out.println("Oldest: Friend 3");
			  break;
		   }
		}
		 switch (4) //check young
		 {
		   case 4:
		   if(fri1<fri2 && fri1<fri3)
		   {
		      System.out.println("Youngest: Friend 1");
			  break;
		   }
		   case 5:
		   if(fri2<fri1 && fri2<fri3)
		   {
		      System.out.println("Youngest: Friend 2");
			  break;
		   }
		   case 6:
		   if(fri3<fri2 && fri3<fri1)
		   {
		      System.out.println("Youngest: Friend 3");
			  break;
		   }
		 }
		   
		
		sc.close();
		
	}
}
		