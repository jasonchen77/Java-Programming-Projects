//////////////////////////////////////////////////////////////////////////////////////////////
// CMSC-255 Fall 2014
//
// Name: Jason Chen
// Lab Section number : 901
// Project: Project-5
//
// Description: This program will calculate the sample mean, median, first and third quartile, 
// mode, sample variance, sample standard deviation, and range. 
//
//
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;

public class Project5
{
  public static void main(String[] args)
  {
    int[] data = {81, 1, 8, 69, 30, 34, 0, 0, 56, 54, 2, 6, 21, 14, 46, 136, 17, 23, 2, 0, 1, 5, 71, 105, 39, 10, 40, 1, 0, 7, 4, 0, 23, 53, 4, 27, 1, 
      11, 0, 14, 19, 23, 105, 4, 0, 24, 4, 0, 63, 6};
    
    showData(data);
    bubbleSort(data);
    showData(data);
    System.out.println("Mean: " + mean(data));
    System.out.println("Median: " + median(data));
    System.out.println("First Quartile: " + firstQuartile(data));
    System.out.println("Third Quartile: " + thirdQuartile(data));
    mode(data);
    System.out.println("Variance: " + variance(data));
    System.out.println("Standard Deviation: " + sDeviation(data));
    System.out.println("Range: " + range(data));
    
  }
  
  /**
   * Prints data
   * @param data the data array
   */
  public static void showData(int[] data)
  {
    System.out.print("Data: ");
    for (int i=0; i<data.length; i++)
    {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }
  
  /**
   * Sorts data
   * @param data the data array
   */
  public static void bubbleSort(int[] data)
  {
    int temp = 0;
    for (int i=0; i<data.length; i++)
    {
      for (int j=0; j<data.length-i-1; j++)
      {
        if (data[j] > data[j+1])
        {
          temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
    }
  }
  
  /**
   * Computes mean
   * @param data the data array
   * @return the mean
   */
  public static double mean(int[] data)
  {
    double total = 0;
    for (double element : data)
    {
      total = total + element;
    }
    double dataMean = total / data.length;
    return dataMean;
  }
  
   /**
   * Computes median
   * @param data the data array
   * @return the median
   */
  public static double median(int[] data)
  {
    double dataMedian;
    if (data.length % 2 == 0)
    {
     double num1 = data[data.length/2-1];
     double num2 = data[data.length/2];
     dataMedian = (num1 + num2) / 2;
    }
    else
    {
      dataMedian = data[data.length/2+1];
    }
    return dataMedian;
  }
  
   /**
   * Computes first quartile
   * @param data the data array
   * @return the first quartile
   */
  public static double firstQuartile(int[] data)
  {
    double dataFQ=0;
    if (data.length % 2 == 0)
    {
      if ((data.length-data.length/2) % 2 == 0)
      {
        double num1 = data[(data.length-data.length/2)/2-1];
        double num2 = data[(data.length-data.length/2)/2];
        dataFQ = (num1 + num2) / 2;
      }
      else
      {
        dataFQ = data[(data.length-data.length/2)/2];
      }
    }
    else
    {
     if (((data.length-1)/2) % 2 == 0)
     {
       double num1 = data[(data.length-1)/4-1];
       double num2 = data[(data.length-1)/4];
       dataFQ = (num1 + num2) / 2;
     }
     else
     {
       dataFQ = data[(data.length-1)/4];
     }
    }
    return dataFQ;
  }
  
  /**
   * Computes third quartile
   * @param data the data array
   * @return the third quartile
   */
  public static double thirdQuartile(int[] data)
  {
    double dataTQ=0;
    if (data.length % 2 == 0)
    {
      if ((data.length-data.length/2) % 2 == 0)
      {
        double num1 = data[(data.length-data.length/2)/2-1+data.length/2];
        double num2 = data[(data.length-data.length/2)/2+data.length/2];
        dataTQ = (num1 + num2) / 2;
      }
      else
      {
        dataTQ = data[(data.length-data.length/2)/2+data.length/2];
      }
    }
    else
    {
     if (((data.length-1)/2) % 2 == 0)
     {
       double num1 = data[(data.length-1)/4-1+data.length/2+1];
       double num2 = data[(data.length-1)/4+data.length/2+1];
       dataTQ = (num1 + num2) / 2;
     }
     else
     {
       dataTQ = data[(data.length-1)/4+data.length/2+1];
     }
    }
    return dataTQ;
  }
  
  /**
   * Computes mode
   * @param data the data array
   */
  public static void mode(int[] data)
  {
    ArrayList<Integer> dataMode = new ArrayList<Integer>();
    int max = 0;
    for (int i = 0; i < data.length; i++)
    {
      int count = 0;
      for (int j = 0; j < data.length; j++)
      {
        if (data[j] == data[i])
        {
          count++;
        }
      }
      if (count > max)
      {
        max = count;
        dataMode.clear();
        dataMode.add(data[i]);
      } 
      else if (count == max && data[i] != data[i-1])
      {
        dataMode.add(data[i]);
      }
    }
    System.out.print("Mode: ");
    for (Integer num : dataMode)
    {
      System.out.print(num);
    }
    System.out.println();
  }
  
   /**
   * Computes variance
   * @param data the data array
   * @return the variance
   */
  public static double variance(int[] data)
  {
    double total = 0;
    double dataVariance;
    for (int i=0; i<data.length; i++)
    {
      double top = (data[i]-mean(data)) * (data[i]-mean(data));
      total = total + top;
    }
    dataVariance = total / (data.length-1);
    return dataVariance;
  }
  
  /**
   * Computes standard deviation
   * @param data the data array
   * @return the standard deviation
   */
  public static double sDeviation(int[] data)
  {
    double total = 0;
    double dataSDeviation;
    for (int i=0; i<data.length; i++)
    {
      double top = (data[i]-mean(data)) * (data[i]-mean(data));
      total = total + top;
    }
    dataSDeviation = Math.sqrt(total / (data.length-1));
    return dataSDeviation;
  }
  
  /**
   * Computes range
   * @param data the data array
   * @return the range
   */
  public static int range(int[] data)
  {
    int dataRange = data[data.length-1] - data[0];
    return dataRange;
  }
}