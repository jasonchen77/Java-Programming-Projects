import java.util.Scanner;

public class Lab5Number22DoLoop
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     
     System.out.println("Enter a positive integer: ");
     
     int n = in.nextInt();
      int i = 1;
      int sum = 0;
      do
      {
         sum+=i;
         i++;
      }
      while (i <= n);
      System.out.println("The sum is " + sum);
   }
}
