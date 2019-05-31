import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Lab8Number21MemoPadCreator
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Date now = new Date();
      Scanner console = new Scanner(System.in);
      System.out.print("Output file: ");
      String filename = console.nextLine();

      PrintWriter out = new PrintWriter(filename);

      boolean done = false;
      while (!done)
      {
         System.out.println("Memo topic (enter -1 to end):");
         String topic = console.nextLine();
         if (topic.equals("-1"))
         {
            done = true;
         }
         else
         {
            System.out.println("Memo text:");
            String message = console.nextLine();
            // Create the new date object and obtain a dateStamp
            Date dateStamp = now;
            out.println(topic);
            out.println(dateStamp);
            out.println(message);
         }
      }
      // Close the output file
      out.close();
   }
}
