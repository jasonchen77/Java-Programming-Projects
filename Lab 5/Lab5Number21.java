import java.util.Scanner;

public class Lab5Number21
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     
     System.out.println("Enter a positive integer: ");
     
     int n = in.nextInt();
     int i = 1;
     int sum = 0;
      while (i <= n)
      {
         sum+=i;
         i++;
      }
      System.out.println("The sum is " + sum);
   }
}
