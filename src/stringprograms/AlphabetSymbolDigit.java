package stringprograms;

import java.util.Scanner;
public class AlphabetSymbolDigit {
	
	public static void main(String[] args) {
		
	
	  char ch;
	  Scanner p=new Scanner(System.in);
	  System.out.print("Enter any char : ");
	  ch=p.next().charAt(0);
	  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	  {
	   System.out.println(ch+" is Alphabit");
	  }
	  else if(ch>='0'&&ch<='9')
	  {
	   System.out.println(ch+" is Digit");
	  }
	  else
	  {
	   System.out.println(ch+" is spacial Symble");
	  }
	 }
	}