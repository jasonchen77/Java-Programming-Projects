public class Lab6Number1
{
  public static void main (String[] args)
  {
    double length = 3.4;
    double width = 8.4;
    double rectArea = AreaOfRectangle(length, width);
    System.out.println("The length of rectangle is: " + length);
    System.out.println("The width of rectangle is: " + width);
    System.out.println("The area of rectangle is: " + rectArea);
  
  }
  
  /**
   Computes the area of a rectangle.
   @param length the length of rectangle
   @param width the width of rectangle
   @return the area of rectangle
  */
  public static double AreaOfRectangle (double length, double width)
  {
    double area = length * width;
    return area;
  
  }
}