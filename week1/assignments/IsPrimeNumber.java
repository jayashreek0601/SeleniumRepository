package week1.assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 29;

		boolean isPrime = true;

		if (n <= 1)
		{
			isPrime = false;
		} 
		else 
		{
			for (int i = 2; i <= n - 1; i++) 
			{
				if (n % i == 0) 
				{
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) 
		{
			System.out.println(n + " is Prime");
		} 
		else 
		{
			System.out.println(n + " is Non-Prime");
		}
	}
}

