//////////////////////////////////////////////////////////////////////////////////////////////
// CMSC-255 Fall 2014
//
// Name: Jason Chen
// Lab Section number : 901
// Project: Project-3
//
// Description: This program will calculate maximum height, flight time, range, and 
// x, y coordinates during the flight.
//
//
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Project3ProjectileMotion 
{
 public static void main(String[] args) 
 {
   final double GRAVITY_CONSTANT_METERS = 9.8;
   final double GRAVITY_CONSTANT_FEET = 32;
   
   Scanner in = new Scanner(System.in);
   
   System.out.print("Enter the initial angle of elevation: ");
   if (in.hasNextDouble())
   {
   double angleDegree = in.nextDouble();
   // Convert to radian
   double angleRadian = Math.toRadians(angleDegree);
   
   System.out.print("Enter the initial speed: ");
   if (in.hasNextDouble())
   {
     //Initial velocity
     double speed = in.nextDouble();
     
     System.out.print("Enter M for meters or F for feet: ");
     String speedUnit = in.next();
     if (speedUnit.equals("M") || speedUnit.equals("F"))
     {
       double g = 0;
       // In meters
       if (speedUnit.equals("M"))
       {
         g = GRAVITY_CONSTANT_METERS;
       }
       // In feet
       if (speedUnit.equals("F"))
       {
         g = GRAVITY_CONSTANT_FEET;
       }
       double maxHeight = ((speed * Math.sin(angleRadian))*(speed * Math.sin(angleRadian))) / (2 * g);
       double tof = (2 * speed * Math.sin(angleRadian)) / g;
       double range = ((speed * speed) / g) * (Math.sin(2 * angleRadian));
       
       System.out.println("Summary Information");
       System.out.format("Maximum Height: %13.2f%n", maxHeight);
       System.out.format("Flight Time: %9.2f%n", tof);
       System.out.format("Range: %15d%n", Math.round(range));
       
       System.out.println("Trajectory values");
       System.out.println("----------------------------------------------------------------------");
       System.out.println("Time in Seconds      x-coordinate     y-coordinate");
       System.out.println("----------------------------------------------------------------------");
       
       
       double x = 0;
       double y = 0;
       for (int time = 0; y >= 0; time += 10)
       {
         x = (speed * Math.cos(angleRadian)) * time;
         y = (((speed * (Math.sin(angleRadian))) * time) - ((g * (time * time)) / 2));
         
         System.out.format("%d                %10.2f        %9.2f%n", time, x, y);
       }
     }
     else
     {
       System.out.println("Not a valid unit.");
     }
   }
   else
   {
     System.out.println("Not a valid number.");
   }
   }
   else
   {
     System.out.println("Not a valid number.");
   }
 }
}