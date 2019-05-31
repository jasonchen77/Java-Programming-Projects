import java.util.Scanner;

public class Lab5Number4
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     
     int evenNum = 0;
     int oddNum = 0;
     int x = 0;
       
     for (int i=0; i<5; i++)
     {
       System.out.println("Enter an integer: ");
       x = in.nextInt();
       System.out.println("The input is: " + x);
       
       //even
       if ((x/2)*2==x)
       {
       evenNum++;
       }
       //odd
       else
       {
       oddNum++;
       }
  
     }
     
     System.out.println("Done");
     System.out.println("Number of even is " + evenNum);
     System.out.println("Number of odd is " + oddNum);

   }
}
