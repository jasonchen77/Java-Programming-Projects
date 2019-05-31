import java.util.Scanner;

public class Lab8Number7
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     boolean correct = false;
     String x = "";
     while (!correct)
     {
     System.out.println("Enter an integer");
     x = in.next();
     try
     {
       Integer.parseInt(x);
       correct = true;
     }
     catch (Exception e)
     {
       System.out.println("Not an integer");
     }
     }
     System.out.println("The integer you enter is " + x);

   }
}  
