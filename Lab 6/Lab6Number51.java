public class Lab6Number51
{
  public static void main(String[] args)
  {
      boolean even = false;
      System.out.println(decode(1, even));
      System.out.println(decode(2, even));
      System.out.println(decode(3, even));
      System.out.println(decode(4, even));
      System.out.println(decode(5, even));
      System.out.println(decode(6, even));
      System.out.println(decode(7, even));
      System.out.println(decode(8, even));
      System.out.println(decode(9, even));
      even = ! even;
      System.out.println(decode(1, even));
      System.out.println(decode(2, even));
      System.out.println(decode(3, even));
      System.out.println(decode(4, even));
      System.out.println(decode(5, even));
      System.out.println(decode(6, even));
      System.out.println(decode(7, even));
      System.out.println(decode(8, even));
      System.out.println(decode(9, even));      
  }
  
  public static int decode(int num, boolean even)
  {
    int finalResult = 0;
    if (even)
    {
      int result = num * 2;
      if (result < 10)
      {
        finalResult = result;
      }
      else
      {
        int ones = 0;
        int teens = 0;
        teens = result / 10;
        ones = result % 10;
        finalResult = teens + ones;
      
      }
    }
    else
    {
      finalResult = num;
    }
    return finalResult;
  
  }
  

}