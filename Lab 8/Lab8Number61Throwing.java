import java.util.*;

public class Lab8Number61Throwing
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
    
     if (x == (int)x)
     {
       return x;
     }
     else
     {
       throw new IllegalArgumentException("Not an integer");
     }
     }
     catch (Exception e)
     {
       System.out.println("Not an integer");
       return x;
     }
   }
}  
