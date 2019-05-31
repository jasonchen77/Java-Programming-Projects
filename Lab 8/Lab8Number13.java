import java.io.*;
import java.util.Scanner;

public class Lab8Number13
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File inputFile = new File("ziptable.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("ziptableout.txt");
    
    while (in.hasNext())
    {
      String abbreviation = "";
      String state = "";
      String zip = "";
      
      String input = in.next();
      if (input.length()<3)
      {
        abbreviation = input;
      }
      else if (input.matches("\\d{3}-\\d{3}") || input.matches("\\d{3}"))
      {
        if (input.matches("\\d{3}"))
        {
          zip = input + "-" + input;
        }
        else
        {
          zip = input;
        }
      }
      else
      {
        state = input;
      }
      
      out.print(state + " " + abbreviation + " " + zip);
      if (input.matches("\\d{3}-\\d{3}"))
      {
        out.println();
      }

    }
    in.close();
    out.close();
  }
}