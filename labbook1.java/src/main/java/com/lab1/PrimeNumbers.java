package com.lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

int p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number");
String s=br.readLine();
int n1=Integer.parseInt(s);

for(int i=2;i<n1;i++) {
	          p=0;
			  for(int j=2;j<i;j++)
			  { 
				  if(i%j==0)
					  p=1;
				  
			  }
				if(p==0)
					System.out.println(i);
}

	}

}
