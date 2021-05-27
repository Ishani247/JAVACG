package com.lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assign6 {
	
static int i;	
  
  static int sum,s1=0,s2=0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("enter the number");
		   String c=br.readLine();
		   int num=Integer.parseInt(c);
		   
		   
		   for(i=1;i<=num;i++)
		   {    
			   s1=s1+i*i;
			   s2=s2+i;
			   
		   }
		   
		    sum=s1-(s2*s2);
		    System.out.println("the sum is " +sum);
	}

}
