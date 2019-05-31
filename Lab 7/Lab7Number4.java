import java.util.Scanner;

public class Lab7Number4
{
  public static void main(String[] args)
  {
    int numOfRandom;
    int numValue;
    int[] values;
    int[] digits;
    int[] numDigits;
    
    Scanner in = new Scanner(System.in);
    System.out.print("How many random numbers should be generated? ");
    numOfRandom = in.nextInt();
    System.out.print("What is the number of values for each random draw? ");
    numValue = in.nextInt();
    
    values = new int[numOfRandom];
    digits = new int[numValue];
    numDigits = new int[numValue];
    
    for (int i=0; i<values.length; i++)
    {
      values[i] = (int)(Math.random() * numValue);
    }
    
    for (int i=0; i<digits.length; i++)
    {
      digits[i] = i;
    }
    
    for (int i=0; i<digits.length; i++)
    {
      for (int j=0; j<values.length; j++)
      {
        if (digits[i]==values[j])
        {
          numDigits[i]++;
        }
      }
    }
    
    for (int i=0; i<digits.length; i++)
    {
      System.out.println(digits[i] + " " + numDigits[i]);
    }
    
  }
}