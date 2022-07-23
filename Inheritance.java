class ParentDemo
{
	void add()
	{
		System.out.println("Iam in add method");
	}
}
class Child extends ParentDemo
{
	void sub()
	{
		System.out.println("Iam in sub method");
	}
}
class Mother extends Child
{
	void work()
	{
		System.out.println("Iam working");
	}
}
class Father extends ParentDemo
{
	void drive()
	{
		System.out.println("I am driving");
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		Mother m=new Mother();
		m.work();
		m.sub();
		m.add();
		Father f=new Father();
		f.drive();
	}
}	