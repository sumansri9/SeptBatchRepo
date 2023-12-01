package package1;

public class Arthematic {
	public int addition(int a,int b){
	int c= a+b;
	System.out.println("Addition is" +c);
	return c;
	}
	public int subtract(int d, int e){
	int  f= d-e;
	System.out.println("Subtraction is" +f);
	return f;
	}
	public int multiply(int g, int h) {
	int i= g*h;
	System.out.println("Multiply is" +i);
	return i;
	}
	public void div(int j, int k) {
		int l=j/k;
		System.out.println("div is" +l);
	}
	public static void main(String[] args) {
		Arthematic obj=new Arthematic();
		int add=obj.addition(10, 2);
		int add1=obj.addition(add, 2);
		int sub=obj.subtract(14, 2);
		int multi= obj.multiply(16, 2);
		obj.div(multi, 2);
				
	}
}
