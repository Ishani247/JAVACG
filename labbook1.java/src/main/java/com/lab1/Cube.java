package com.lab1;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Cube {
	 static int t;
     static	int count=0;
    static int sum =0;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the number");
   String c=br.readLine();
   int num=Integer.parseInt(c);
          
       while(num!=0)
        {
    	   t=num%10;
    	    sum =sum + t*t*t;
    	   
    	   count=count +1;
    		num =num/10;
    	
        }
       System.out.println("sum of the cube " +sum );
	} 
}