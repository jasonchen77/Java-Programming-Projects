import java.util.Scanner;

public class Lab5Number72
{
   public static void main(String[] args)
   {
     
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a positive integer: ");
     int n = in.nextInt();
     
     for (int i = 1; i <= n; i++)
     {
       int sum = 0;
       for (int j = 1; j <= i; j++)
       {
         sum += j; 
       }
       System.out.println("The sum of the positive integers from 1 to " + i + " is " + sum);
      
     }
     
   }
}
