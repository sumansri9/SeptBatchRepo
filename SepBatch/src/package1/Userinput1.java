package package1;

import java.util.Scanner;

public class Userinput1 {

	
	public static void main(String[] args)
	{
	System.out.println("Please enter Value of a,b,c,d,e,f");
   	    Scanner ob=new Scanner(System.in);
	    int a=ob.nextInt();
	    int b=ob.nextInt();
	    int c=ob.nextInt();
	   int d=ob.nextInt();
	   int e=ob.nextInt();
	   int f=ob.nextInt();
	   float g= (((((a*b)-c)+d)-e)/f);
	    System.out.println("Value of (((((a*b)-c)+d)-e)/f)="+ g);
}
}