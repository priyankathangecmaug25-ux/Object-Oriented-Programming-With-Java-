/*Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel*/

import java.util.Scanner;
public class VowelConsonantTernary 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        System.out.println(
		(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? "Vowel": "Consonant" );
        sc.close();
    }
}