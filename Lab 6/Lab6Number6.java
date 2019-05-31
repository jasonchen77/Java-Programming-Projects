public class Lab6Number6
{
  public static void main (String[] args)
  {
    System.out.println(bitToHex(13));
  
  }
  
  public static String bitToHex(int num)
  {
    int number = num;
    String output = "";
    if (number >= 0 && number < 10)
    {
      output = Integer.toString(number);
    }
    else if (number == 10)
    {
      output = "A";
    }
    else if (number == 11)
    {
      output = "B";
    }
    else if (number == 12)
    {
      output = "C";
    }
    else if (number == 13)
    {
      output = "D";
    }
    else if (number == 14)
    {
      output = "E";
    }
    else if (number == 15)
    {
      output = "F";
    }
    else
    {
      output = "";
    }
    return output;
  
  }

}