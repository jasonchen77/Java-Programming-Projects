import java.util.Scanner;

public class Lab5Number5GCD
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first integer: ");
      int x = in.nextInt();
      System.out.println("x = " + x);
      System.out.println("Enter the second integer: ");
      int y = in.nextInt();
      System.out.println("y = " + y);
      
      if (x < 0)
      {
        x = x * -1;
      }
      if (y < 0)
      {
        y = y * -1;
      }
      
      while ((x<y && x>=0) || (y<x && y>=0))
      {  
        if (x >= y)
        {
          x = x - y;
        }
        else
        {
          y = y - x;
        }   
      
      }
      if (x == 0)
      {
        System.out.println("The GCD is " + y);
      }
      else
      {
        System.out.println("The GCD is " + x);
      }
   }    
}
