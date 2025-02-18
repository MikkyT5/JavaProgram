package javacode;

public class A_04_IfIFElse {

	public static void main(String[] args)
	{
		int a=10;
		float b=100.44f;
		
		if(a>11)
		{
			System.out.println( "print" +""  +a);
		}
		
		else if(a>6)
		{
			System.out.println("Only one time here if wilbe printed in if selkse if statement");
		}
		else if(a>7)
		{
			System.out.println("Only first time here if wilbe printed in if else if statement for the 1st time when condition is met");
		}
		
		else
		{
			System.out.println(b);
		}

	}

}
