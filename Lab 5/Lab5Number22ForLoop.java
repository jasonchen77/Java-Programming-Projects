import java.util.Scanner;

public class Lab5Number22ForLoop
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     
     System.out.println("Enter a positive integer: ");
     
     int n = in.nextInt();
      int sum = 0;
      for (int i = 1; i <= n; i++)
      {
         sum+=i;
        
      }
      System.out.println("The sum is " + sum);
   }
}
