package com.cg.oopsinjava.inheritanceII;
import java.util.Scanner;
public class Bank {

	
		// TODO Auto-generated method stub
		Scanner sc-new Scanner(System.in);
		void  interst()
		{
			float principle;
			float interst;
			float time;
			
			System.out.println("enter the principle");
			principal=sc.nextFloat();
			System.out.println("enter the interst");
			interst=sc.nextFloat();
			System.out.println("enter the time");
			time=sc.nextFloat();
			float si=(principal*interst*time)/100;
			System.out.println("entert the si="+si);
		}
		
	}

