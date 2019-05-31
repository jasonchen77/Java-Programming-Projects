import java.util.Scanner;

public class Lab8Number3TextIO
{
   public static void main(String[] args)
   {
      String input1 = "Now is the time for all good men to come to the aid of their country.";
      String input2 = "abcdefghijklmnopqrstuvwxyz0123456789";
      String input3 = "a1b2c3 d4";
      String input4 = "Line 1\nLine2\nLine3\nLine4";
      
      Scanner scan1 = new Scanner(input1);
      Scanner scan2 = new Scanner(input2);
      Scanner scan3 = new Scanner(input3);
      Scanner scan4 = new Scanner(input4);
      
      //Part A
      while (scan1.hasNext())
      {
        System.out.print(" " + scan1.next());
      }
      System.out.println();
      
      //Part B
      scan2.useDelimiter("");
      while (scan2.hasNext())
      {
        char ch = scan2.next().charAt(0);
        System.out.print(" " + ch);
      }
      System.out.println();
      
      //Part C
      scan3.useDelimiter("");
      while (scan3.hasNext())
      {
        char ch = scan3.next().charAt(0);
        System.out.print(" " + ch);
      }
      System.out.println();
      
      //Part D
      scan4.useDelimiter("\n");
      while (scan4.hasNext())
      {
        String input = scan4.next();
        System.out.println(input);
      }
   }
}
