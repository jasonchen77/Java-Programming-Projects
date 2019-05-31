import java.util.Scanner;

public class Lab5Number8
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      boolean done = false;
      while (!done)
      {
      System.out.println("Enter the first integer or enter \"q\" to quit: ");
      String num1 = in.next();
      System.out.println("x = " + num1);
      
      if (num1.equals("q"))
      {
        done = true;
        break;
      }
      
      System.out.println("Enter the second integer or enter \"q\" to quit: ");
      String num2 = in.next();
      System.out.println("y = " + num2);
      
      if (num2.equals("q"))
      {
        done = true;
      }
      else
      {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
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
   }    
}
