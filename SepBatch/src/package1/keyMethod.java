package package1;

public class keyMethod {

	public void keyMethod1() {
		  this.keyMethod4(12, 130, 10);
		System.out.println("Default Method");
	 }
	public void keyMethod2(int a) {
		  this.keyMethod1();
		System.out.println("One parameterized Method");
	 }
	public void keyMethod3(int a, int b) {
		  this.keyMethod5(1,2,3,4);
		System.out.println("Two parametrized Method");
	 }
	public void keyMethod4(int a, int b, int c) {
		  
		System.out.println("Three parametrized Method");
	 }
	public void keyMethod5(int a, int b, int c, int d) {
		  this.keyMethod2(1);
		System.out.println("Four parametrized Method");
	 }
	public static void main(String[] args) {
		
		keyMethod obj=new keyMethod();
		obj.keyMethod3(10,20);
				}
	}


