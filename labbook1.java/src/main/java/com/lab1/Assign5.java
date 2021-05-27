package com.lab1;

public class Assign5 {
  static int calculateSum( int n, int x,int y)

  
  {

      int S1, S2, S3;

      S1 = ((n/ x)) * (2 * x + (n / x - 1) * x) / 2;

      S2 = ((n / y)) * (2 * y+ (n / y - 1) * y) / 2;

      S3 = ((n / (x * y))) * (2 * (x * y)

                        + (n / (x * y) - 1) * (x* y))/ 2;

      return S1 + S2 - S3;

  }

  public static void main(String []args)

  {

      int n = 19;

      int x = 3, y= 5;
	System.out.println(calculateSum(n,x,y));

   

  }
  
}
