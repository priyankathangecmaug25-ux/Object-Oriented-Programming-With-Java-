import java.util.Scanner;
class ExamPassFail 
{

   public static void main(String[] args)
   {  
      Scanner sc=new Scanner(System.in);  // scanner
       System.out.print("Enter marks: "); 
       int m=sc.nextInt();    // read marks
       System.out.println(m>=35? "Student has passed." : "Student has failed.");  
       sc.close(); 
}
}