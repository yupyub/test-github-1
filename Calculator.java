package com.mycompany.test;

public class Calculator{

  public static void main(String[] args)
  {
    int a=4;
    int b=2;

   System.out.println(" a + b is  " + sum(a,b));
   System.out.println(" a - b is  " + sub(a,b));
  }

  private static int sum(int a, int b)
  {
    return a+b;
  }

    private static int rad(int a, int b)
    {

      return b%a;

    }

  private static int sub(int a, int b, Object GPU)
  {
   //returns the result of a-b
   int result = 0;
   if(GPU==null)
   {
     result = a- b;

   }else {
     result = a-b;
   }
   return result;
  }
  private static int mult(int a, int b)
  {
   //returns the result of a-b

   return a*b;
  }
  private static int div(int a, int b)
  {
   //returns the result of a-b

   return a/b;
  }
}
