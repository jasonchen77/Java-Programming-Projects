public class Lab2Number2Expressions
{
   public static void main(String[] args)
   {
      int a = 3;
       int b = 4;
      int c = 5;
      int d = 17;
      System.out.println((a + b)/ c);
      // 3 and 4 are added with sum 7
      // 7 is divided by 5 with quotient 1
      System.out.println(a + b / c);
      // 4 is divided by 5 with quotient 0
      // 3 is added to 0 with sum 3
      System.out.println(a++);
      // 3 is incremented by 1 after the output to 4
      System.out.println(a--);
      // 4 is display from previous incredmention and is decremented by 1 after the output
      System.out.println(a + 1);
      //3 plus 1 equals 4
       System.out.println(d % c);
       // 17 divided by 5 with remainder of 2
      System.out.println(d / c);
      // 17 divided by 5 with quotient 3
      System.out.println(d % b);
      // 17 divided by 4 with remainder of 1
      System.out.println(d / b);
      //  17 divided by 4 with quotient of 4
      System.out.println(d + a / d + b);
      // 3 divided by 17 plus 17 plus 4 without decimals is 21
      System.out.println((d + a) / (d + b));
      // (17+3)/(17+4) with quotient of 0
      System.out.println(Math.sqrt(b));
      // square root of 4 is 2.0
      System.out.println(Math.pow(a, b));
      // 3 to 4th power is 81
      System.out.println(Math.abs(-a));
      // absolute value of -3 is 3
      System.out.println(Math.max(a, b));
      // the larger of 3 and 4 is 4
   }
}
