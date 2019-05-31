import java.io.*;
import java.util.Scanner;

public class Lab8Number11
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File inputFile = new File("ziptable.txt");
    Scanner in = new Scanner(inputFile);
    
    while (in.hasNextLine())
    {
      String input = in.nextLine();
      System.out.println(input);
    }
    in.close();
  }
}