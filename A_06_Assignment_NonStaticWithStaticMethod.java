package javacode;

public class A_06_Assignment_NonStaticWithStaticMethod
{
	
	public static void add()//static method-non parametrized
	{
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a,int b)//non static method-parametrized
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void mul(int a,int b)//static method-parametrized
	{
		
		int c=a*b;
		System.out.println(c);
	}
	public void div()//non static method-nonparametrized
	{

		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		add();//static method-non parametrized called here
		mul(3,4);//static method parametrized called here
		A_06_Assignment_NonStaticWithStaticMethod objectref1=new A_06_Assignment_NonStaticWithStaticMethod();//object creation
		objectref1.sub(6,4);
		objectref1.div();
		
		

	}

}
