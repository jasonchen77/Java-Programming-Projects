public class Lab7Number11
{
  public static void main(String[] args)
  {
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
    System.out.println("Number of items: " + x.length);
    System.out.println("First item is: " + x[0]);
    System.out.println("Last item is: " + x[8]);
    System.out.println("x[x.length-1] is: " + x[x.length-1]);
    
    for (int i=0; i<x.length; i++)
    {
      System.out.print(x[i] + " ");
    }
    System.out.println("");
    
    for (int i=0; i<x.length; i++)
    {
      System.out.print("Element " + i + " is: " + x[i] + " ");
    }
    System.out.println("");
    
    for (int i=x.length-1; i>=0; i--)
    {
      System.out.print("Element " + i + " is: " + x[i] + " ");
    }
    System.out.println("");
    
    for (double element : x)
    {
      System.out.print(element + " ");
    }
    System.out.println("");
  }

}