package com.lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Assign8 {

static int n;
			public static void main(String args[]) throws Exception {
			       boolean flag = false;
			        
			       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			       System.out.println("Enter a number : ");
			       String b = br.readLine();
				   int num = Integer.parseInt(b);
			      
			       while(num%2==0) {
			       
			           if(n==1){
			               flag= true;
			                  break;    }
			       
                                n=n/2;
				       
			       }
				       if(flag){
				           System.out.println("power of 2.");
				       }else{
				           System.out.println("not a power of 2 ");
				       }
				    }
			}
