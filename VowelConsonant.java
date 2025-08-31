/*Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.
Input:
Enter a character: e
Output:
Vowel*/

import java.util.Scanner;

class VowelConsonant 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
		
		 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
		{
            System.out.println("Vowel");
        } 
		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
            System.out.println("Consonant");
        }
		else 
		{
            System.out.println("Error: Not a valid alphabet");
        }
            

        sc.close();
    }
}
