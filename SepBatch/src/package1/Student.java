package package1;

public class Student {
int rollno, age;
public void display1()
{
	System.out.println("Welcome to all of you");
}
public void display2() {
	System.out.println("Automation is very easy");
}
public static void main(String[] args) {
	Student abc=new Student();
	abc.display1();
	abc.display2();
	abc.rollno=20;
	abc.age=25;
	
	System.out.println(abc.age);
	System.out.println(abc.rollno);
}
}
