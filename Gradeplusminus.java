/*Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−   */

import java.util.Scanner;

public class Gradeplusminus
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 80 && marks <= 100)
		{
            if (marks >= 85)
			{
                System.out.println("Grade: A+");
            } 
			else 
			{
                System.out.println("Grade: A-");
            }
        } 
		else if (marks >= 60 && marks < 80) 
		{
            if (marks >= 65) 
			{
                System.out.println("Grade: B+");
            } 
			else
			{
                System.out.println("Grade: B-");
            }
        }
		else 
		{
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
