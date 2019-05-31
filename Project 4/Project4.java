//////////////////////////////////////////////////////////////////////////////////////////////
// CMSC-255 Fall 2014
//
// Name: Jason Chen
// Lab Section number : 901
// Project: Project-4
//
// Description: This program will calculate future value of an annuity and the future value 
// with continuous compounding, FV/c-FV, periods necessary to achieve a given future value 
// (FV) for a given interest rate, and present value.
// 
//
//
/////////////////////////////////////////////////////////////////////////////////////////////

public class Project4
{
  public static void main(String[] args)
  {
    // Future Value
    System.out.println("Name: Jason Chen   V-number: 0000000");
    System.out.println("Payment    APR    Years       FV     FV/Continuous      FV/c – FV");
    System.out.println("--------   ---   -------  ---------  -------------      ----------");
    for (double p=500; p<1501; p+=500)
    {
      for (int y=5; y<11; y+=2)
      {
        if (y==9)
        {
          y=10;
        }
        for (int r=2; r<9; r++)
        {
          System.out.format("$%7.2f    %s%%   %2d      $%8.2f    $%8.2f           $%.2f %n", p, r, y, futureValue(p, r, y), futureValueCompound(p, r, y), fvcfv(p, r, y));
        }
      }
    }
    
    System.out.println();
    
    // Number of periods
    System.out.println("FV         rate per period      Periodic payment        Number of periods");
    System.out.println("--------- -----------------    -------------------     ---------------------");
    for (double fv=1000; fv<=2000; fv+=200)
    {
      int r = 5;
      double p = 200;
      System.out.format("$%7.2f         %s%%             $%.2f                 %.2f  %n", fv, r, p, numPeriods(fv, r, p));
    }
    
    System.out.println();
    
    // Present value
    System.out.println("C1       rate per period    Number of periods    Present Value");
    System.out.println("-------- ----------------   -----------------    ---------------");
    for (int n=1; n<=3; n++)
    {
      for (int r=3; r<=6; r++)
      {
        double c1 = 100;
        System.out.format("$%.2f           %s%%                 %d             $%.2f  %n", c1, r, n, presentValue(c1, r, n));
      }
    }
    
  }
  
  /**
   * Computes future value
   * @param p the payment
   * @param rate the rate
   * @param y the year
   * @return the future value
  */
  public static double futureValue(double p, double rate, int y)
  {
    double r = rate*0.01;
    double fv = p*(((Math.pow((1+r),y))-1)/r);
    return fv; 
  }
  
   /**
   * Computes future value compounding
   * @param p the payment
   * @param rate the rate
   * @param y the year
   * @return the future value compoundind
  */
  public static double futureValueCompound(double p, double rate, int y)
  {
    double r = rate*0.01;
    double fvc = p*((Math.exp(r*y)-1)/(Math.exp(r)-1));
    return fvc;
  }
  
   /**
   * Computes future value compound minus future value
   * @param p the payment
   * @param rate the rate
   * @param y the year
   * @return the future value compound minus future value
  */
  public static double fvcfv(double p, double rate, int y)
  {
    double fvcfv = futureValueCompound(p, rate, y) - futureValue(p, rate, y);
    return fvcfv;  
  }
  
   /**
   * Computes number of periods needed to achieve future value
   * @param fv the future value
   * @param rate the rate
   * @param p the payment
   * @return the number of periods
  */
  public static double numPeriods(double fv, double rate, double p)
  {
    double r = rate*0.01;
    double nfv = Math.log(1+(fv*r)/p)/Math.log(1+r);
    return nfv;
  }
  
  /**
   * Computes present value
   * @param c1 the cash flow at period 1
   * @param rate the rate
   * @param n the number of periods
   * @return the present value
  */
  public static double presentValue(double c1, double rate, int n)
  {
    double r = rate*0.01;
    double pv = c1/(Math.pow((1+r), n));
    return pv;
  }
}