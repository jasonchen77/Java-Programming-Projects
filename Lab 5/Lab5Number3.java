import java.util.Scanner;

public class Lab5Number3
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
      
      
     String input = "";
     int num = 0;
     int i = 0;
     boolean done = false;
     int total = 0;
     while (!done)
      {
      System.out.println("Enter a number or enter \"q\" to quit: ");
      input = in.next();
      if (input.equals("q"))
      {
      done = true;
      }
      else
      {
      num = Integer.parseInt(input);
      total += num;
      i++;
      }
      }
      System.out.println("The total is " + total);
      System.out.println("The number of entries is " + i);
   }
}
