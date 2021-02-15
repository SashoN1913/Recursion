package FirstRecursionProject;

public class RecursionProject 
{
	public static int sumOfN(int n)
	{
		if(n < 1)
		{
			return 0;
		}
		
		return n + sumOfN(n - 1);
	}
	
	public static int sumOfDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		
		return (n % 10 + sumOfDigits(n / 10));
	}
	
	public static void digitsOfNumberFromLeft(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		digitsOfNumberFromLeft(n / 10);
		System.out.println(n % 10);
	}
	
	public static void digitsOfNumberFromRight(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		System.out.println(n % 10);
		digitsOfNumberFromLeft(n / 10);
	}
	
	public static void numbersInRow(int n)
	{
		if(n < 1)
		{
			return;
		}
		
	}
	public static void main(String[] args) 
	{
		int n = 15;
		System.out.println("First excercise");
		System.out.println(sumOfN(n));
		System.out.println("Second excercise");
		System.out.println(sumOfDigits(n));
		System.out.println("Third excercise");
		digitsOfNumberFromLeft(n);
		System.out.println("Fourth excercise");
		digitsOfNumberFromRight(n);
		
		
	}
		
}
