package package1;

public class Automation 
{
  public Automation() {
	  this (25,26,27);
	System.out.println("Default Constructor");
 }
  public Automation(int a) {
	this ();
	System.out.println("one parameterized Constructor");
}
  public Automation(int a, int b) {
	this (1,2,3,4);
	System.out.println("Two parameterized Constructor");
}
  public Automation(int a, int b, int c) {
	  
	System.out.println("Three parameterized Constructor");
}
  public Automation(int a, int b, int c, int d) {
	 
	  this (12);
	System.out.println("Four parameterized Constructor");
}
   public static void main(String[] args) 
  {
   Automation ob=new Automation(11,12);
}

}