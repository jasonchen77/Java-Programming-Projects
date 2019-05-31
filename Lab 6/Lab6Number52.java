public class Lab6Number52
{
  public static void main(String[] args)
   { 
      int num = 2315778;
      System.out.println("Credit card number: " + num + " is " + checkDigits(num));
      num = 1234567;
      System.out.println("Credit card number: " + num + " is " + checkDigits(num));
      num = 7654321;
      System.out.println("Credit card number: " + num + " is " + checkDigits(num));
      num = 1111111;
      System.out.println("Credit card number: " + num + " is " + checkDigits(num));
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
  
  public static String checkDigits(int number)
  {
    int digit1 = number % 10;
    int digit2 = number / 10;
    int digit3 = number / 100;
    int digit4 = number / 1000;
    int digit5 = number / 10000;
    int digit6 = number / 100000;
    int digit7 = number / 1000000;
    
    int decodeDigit1 = decode(digit1, false);
    int decodeDigit2 = decode(digit2, true);
    int decodeDigit3 = decode(digit3, false);
    int decodeDigit4 = decode(digit4, true);
    int decodeDigit5 = decode(digit5, false);
    int decodeDigit6 = decode(digit6, true);
    int decodeDigit7 = decode(digit7, false);
    
    int total = decodeDigit1 + decodeDigit2 + decodeDigit3 + decodeDigit4 + decodeDigit5 + decodeDigit6 + decodeDigit7;
    int remainder = total % 10;
    
    String output = "";
    if (remainder == 0)
    {
      output = "valid";
    }
    else
    {
      output = "invalid";
    }
    return output;
  
  }
  

}