package week3.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] chars = test.toCharArray();
		for (int i = chars.length; i >= 0; i--) {
			if (i % 2 != 0) {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		System.out.println(chars);
	}

}
