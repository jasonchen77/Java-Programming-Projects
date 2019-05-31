import java.io.*;
import java.util.Scanner;

public class Lab8Number4
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File input = new File("numbers.txt");
    Scanner in = new Scanner(input);
    
    double total = 0;
    while (in.hasNextDouble())
    {
      double value = in.nextDouble();
      System.out.println(value);
      total = total + value;
    }
    System.out.println("Total: " + total);
  }
}