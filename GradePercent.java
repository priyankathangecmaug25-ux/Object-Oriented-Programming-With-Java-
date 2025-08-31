/*Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail
Input:
Enter percentage marks: 82
Output:
Grade: A*/

import java.util.Scanner;
public class GradePercent
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter Percentage Marks: ");
        int pmark = sc.nextInt();
		 
		switch (1)
		{
            case 1: 
			// Fail condition
                if (pmark>= 0 &&pmark< 36) 
				{
                    System.out.println("Fail");
                    break;
                }
				
            case 2: 
			// Grade C
                if (pmark>= 36 && pmark <= 50)
				{
                    System.out.println("Grade: C");
                    break;
                }
            case 3: // Grade B
                if (pmark>= 51 && pmark <= 65) 
				{
                    System.out.println("Grade: B");
                    break;
                }
            case 4: // Grade B+
                if (pmark>= 66 && pmark <= 75) {
                    System.out.println("Grade: B+");
                    break;
                }
            case 5: // Grade A
                if (pmark>= 76 && pmark <= 89) 
				{
                    System.out.println("Grade: A");
                    break;
                }
            case 6: // Grade A+
                if (pmark >= 90 && pmark<= 100) 
				{
                    System.out.println("Grade: A+");
                    break;
                }
            default:
                if (pmark< 0 || pmark> 100) 
				{
                    System.out.println("Invalid percentage entered.");
                }
        }

        sc.close();
    }
}