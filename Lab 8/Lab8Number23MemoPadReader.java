import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Lab8Number23MemoPadReader
{
   public static void main(String[] args) throws IOException
   {
      Scanner console = new Scanner(System.in);
     /* System.out.print("Input file: ");
      String inputFileName = console.nextLine();
      
      File inFile = new File(inputFileName);
      Scanner in = new Scanner(inFile);
      */
      JFileChooser chooser = new JFileChooser();
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
      {
        File selectedFile = chooser.getSelectedFile();
        Scanner in = new Scanner(selectedFile);
        
      boolean done = false;
      while (in.hasNextLine() && !done)
      {
         String topic = in.nextLine();
         String dateStamp = in.nextLine();
         String message = in.nextLine();
         System.out.println(topic + "\n" + dateStamp + "\n" + message);
            
         if (selectedFile.exists()) // You should only ask to display the next memo if 
                    // there are more memos in the file
         {
            System.out.println("Do you want to read the next memo (y/n)?");
            String ans = console.nextLine();
            if (ans.equalsIgnoreCase("n"))
            {
               done = true;
            }
            
         }
      }
      }
   }
}



