/*42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output:
153
370
371
407*/

public class Armstrong100t0500 
{
    public static void main(String[] args) 
	{
        for (int num = 100; num <= 500; num++)
		{  
		  int original = num;
            int sum = 0;
            int temp = num;
            
            while (temp != 0) 
			{                   
			 //Sum of cubes of digits
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            
            if (sum == original) 
			{              
                System.out.println(num);   // Check Armstrong
            }
        }
    }
}
