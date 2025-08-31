/*Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam.*/

import java.util.Scanner;

class ExamEligibility 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int held = sc.nextInt();

        System.out.print("Enter total classes attended: ");
        int attended = sc.nextInt();

        // Input: medical cause (Y/N)
        System.out.print("Medical cause (Y/N): ");
        char medical = sc.next().charAt(0);

        double attendancePercentage = (attended * 100.0) / held ;

        if (attendancePercentage >= 75) 
		{
            System.out.println("Student is allowed to sit for the exam.");
        } 
		else 
		{
            if (medical == 'Y') 
			{
                System.out.println("Student is allowed to sit for the exam (medical cause).");
            } 
			else 
			{
                System.out.println("Student is NOT allowed to sit for the exam.");
            }
        }

        sc.close();
    }
}
