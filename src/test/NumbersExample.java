package test;

public class NumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = num1 + num2;
		
		System.out.println("Sum is :" +sum);
		int a = addition (num1,num2);
		System.out.println("Addition result :"+a);
		int b = subtract (num1,num2);
		System.out.println("Subtract result :"+b);
		int c = multiply (num1,num2);
		System.out.println("Multiply result :"+c);
		int d = divide (num1,num2);
		System.out.println("Divide result :"+d);
	}
	
	public static int addition (int x, int y)
	{
		return x + y ;
	}
	
	public static int subtract (int x, int y)
	{
		return x - y;
	}
	public static int multiply (int x,int y)
	{
		return x * y;
	}
	public static int divide (int x, int y)
	{
		return  x/y ;
	}

}
