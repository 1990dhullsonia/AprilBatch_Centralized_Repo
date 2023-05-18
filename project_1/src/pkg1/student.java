package pkg1;

public class student {
int roll_no;
int age;

public void display1()
{
System.out.println("Welcome to all of you");

}
public void display2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	student xyz = new student();
	xyz.roll_no = 001;
	xyz.age = 11;
	System.out.println(xyz.roll_no);
	System.out.println(xyz.age);
	xyz.display1();
	xyz.display2();
	
}
}
