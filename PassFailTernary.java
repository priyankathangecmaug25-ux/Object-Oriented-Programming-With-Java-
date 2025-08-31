/*pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output:
Fail*/

import java.util.Scanner;
class PassFailTernary
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println((marks >= 35) ? "Pass" : "Fail");
        
        sc.close();
    }
}

