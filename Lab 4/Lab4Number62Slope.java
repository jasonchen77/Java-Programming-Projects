import java.util.Scanner;

public class Lab4Number62Slope 
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input x coordinate of the first point: ");
      double xcoord1 = in.nextDouble();

      System.out.print("Input y coordinate of the first point: ");
      double ycoord1 = in.nextDouble();

      System.out.print("Input x coordinate of the second point: ");
      double xcoord2 = in.nextDouble();

      System.out.print("Input y coordinate of the second point: ");
      double ycoord2 = in.nextDouble();

      double slope = (ycoord2 - ycoord1) / (xcoord2 - xcoord1);
      
      if (xcoord1 == xcoord2)
      {
      System.out.println("Error: slope can not be a vertical line.");
      }
      else
      {
      System.out.println("The slope of the line is " + slope);
      }
      
      
   } 
}
