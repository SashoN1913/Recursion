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
	
	public static void numbersInRow(int n, int k)
	{
		if(n == k)
		{
			System.out.print(Math.pow(10, k) + " ");
			System.out.print(Math.pow(10, k) + " ");
			return;
		}
		
		System.out.print(Math.pow(10, k) + " ");
		numbersInRow(n, k + 1);
		System.out.print(Math.pow(10, k) + " ");
		
	}
	
	public static boolean binarySearch(int[] arr, int start, int end, int search)
	{
		int middle = (start + end) / 2;
		
		if(end < start)
		{
			return false;
		}
		
		if(arr[middle] == search)
		{
			return true;
		}
		
		if(search > arr[middle])
		{
			return binarySearch(arr, start, middle - 1, search);
		}
		if(search > arr[middle])
		{
			return binarySearch(arr, middle + 1, end, search);
		}
		
		return false;
	}
	
	public static int gcdOfNumbers(int firstNumber, int secondNumber)
	{
		if(firstNumber == 0)
		{
			return secondNumber;		
		}
		
		if(secondNumber == 0)
		{
			return firstNumber;
		}
		
		if(firstNumber < secondNumber)
		{
			return gcdOfNumbers(firstNumber, secondNumber % firstNumber);
		}
		
		return gcdOfNumbers(secondNumber, firstNumber % secondNumber);
	}
	
	public static int gcdOfNumbersArray(int[] arr, int current, int index)
	{
		if(index >= (arr.length - 1))
		{
			return gcdOfNumbers(current, arr[index]);
		}
		
		current = gcdOfNumbers(current, arr[index]);
		
		return gcdOfNumbersArray(arr, current, index + 1);
		
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
		System.out.println("Fifth excercise");
		numbersInRow(5, 1);
		System.out.println();
		System.out.println("Sixth excercise");
		System.out.println(binarySearch(new int[] { 3, 4, 5}, 0, 4, 5));
		System.out.println(binarySearch(new int[] { 3, 4, 6}, 0, 4, 5));
		System.out.println("Seventh excercise");
		System.out.println(gcdOfNumbers(25, 60));
		System.out.println("Eighth excercise");
		int[] arr = new int[] {35, 45, 85, 90};
		System.out.println(gcdOfNumbersArray(arr, arr[2], 2));
		
	}
		
}
