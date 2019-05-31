import java.util.Scanner;

public class Lab8Number5
{
  public static void main(String[] args)
  {
    String a = "1 2 3 4 5";
    String b = "1.1  2.2  3.3  4.4";
    String c = "1  2.9  3  4.9  5  6.9";
    
    Scanner scan1 = new Scanner(a);
    Scanner scan2 = new Scanner(b);
    Scanner scan3 = new Scanner(c);
    
    while (scan1.hasNext())
    {
      System.out.println(" " + scan1.next());
    }
    
    while (scan2.hasNext())
    {
      System.out.println(" " + scan2.next());
    }
    
    while (scan3.hasNext())
    {
      System.out.println(" " + scan3.next());
    }
  }
}