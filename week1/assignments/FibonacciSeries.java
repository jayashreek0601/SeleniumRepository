package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int first = 0, second = 1, next;
		System.out.print("Fibonacci Series: ");

		for (int i = 1; i <= range; i++) {
			System.out.print(first + " ");

			next = first + second; 
			first = second; 
			second = next;
		}

	}

}
