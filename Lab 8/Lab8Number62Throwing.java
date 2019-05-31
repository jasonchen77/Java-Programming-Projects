import java.util.Scanner;
import java.io.*;

public class Lab8Number62Throwing
{
   public static void main(String[] args)
   {
      int x = getInt();
      System.out.println(x);
   }

   public static int getInt()
  {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter an integer");

     int x = 0;
     try
     {
     x = in.nextInt();
     Scanner input = new Scanner(new File("nofile.txt"));
    
     if (x == (int)x)
     {
       return x;
     }
     else
     {
       throw new Exception();
     }
     }
     catch (IOException e)
     {
       System.out.println("File not found");
       return x;
     }
     catch (Exception e)
     {
       System.out.println("Not an integer");
       return x;
     }
   }
}  
