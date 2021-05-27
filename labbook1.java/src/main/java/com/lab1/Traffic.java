package com.lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traffic {

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     System.out.println("*** TRAFFIC LIGHTS***");
     System.out.println("***1 for Red***");
     System.out.println("***2 for Yellow ***");
     System.out.println("*** 3 for Green***");
     System.out.println("Enter your choice");
     
 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// why this code ? to take input on
	// console.
// how to take input?
System.out.println("enter your choice");
String a = br.readLine();
// how to convert string into integer
int c = Integer.parseInt(a);

switch(c) {
case 1:
	System.out.println("stop");
	break;
case 2:
	System.out.println("Wait");
	break;
case 3:
	System.out.println("Go");
	break;
	default:System.out.println("invalid input");
	
}
	
}
	}
