import java.util.Scanner;

public class Lab7Number22CustomerLister
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
    
    double[] customerBalance = new double[5];
    for (int i=0; i<customerName.length; i++)
    {
      System.out.println("Enter balance for " + customerName[i]);
      customerBalance[i] = in.nextDouble();
    }
    
    for (int i=0; i<customerName.length; i++)
    {
      System.out.println(customerName[i] + ": " + customerBalance[i]);
    }
  }
}