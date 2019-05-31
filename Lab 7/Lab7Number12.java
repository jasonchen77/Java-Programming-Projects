public class Lab7Number12
{
  public static void main(String[] args)
  {
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
    
    double total = 0;
    for (double element : x)
    {
      total = total + element;
    }
    System.out.println("Total is: " + total);
    
    total = 0;
    for (int i=0; i<x.length; i++)
    {
      total = total + x[i];
    }
    System.out.println("Total is: " + total);
    
    double smallest = x[0];
    for (int i=1; i<x.length; i++)
    {
      if (x[i] < smallest)
      {
        smallest = x[i];
      }
    }
    System.out.println("Smallest is: " + smallest);
    
    smallest = x[0];
    int pos = 0;
    for (int i=1; i<x.length; i++)
    {
      if (x[i] < smallest)
      {
        smallest = x[i];
        pos = i;
      }
    }
    System.out.println("Smallest is " + smallest + " at index " + pos);
  }

}