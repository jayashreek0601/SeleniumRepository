package week3.assignments;

public class ReverseOddWords {
	public static void main(String[] args) {

		String test = "I am a software tester";

		// Step 1: Split words
		String[] words = test.split(" ");

		// Step 2: Traverse words
		for (int i = 0; i < words.length; i++) 
		{

	    // Step 3: Check odd index
			if (i % 2 != 0) 
			{

		// Step 4: Convert word to char array
				char[] chars = words[i].toCharArray();

		// Step 5: Print reversed word
				for (int j = chars.length - 1; j >= 0; j--)
				{
					System.out.print(chars[j]);
				}
				System.out.print(" ");

			} 
			else 
			{
		// Step 6: Print even position word as it is
				System.out.print(words[i] + " ");
			}
		}
	}

}
