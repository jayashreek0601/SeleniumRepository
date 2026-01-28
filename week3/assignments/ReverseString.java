package week3.assignments;

public class ReverseString {

	public static void main(String[] args) {
		String companyName="TestLeaf";
		char[] chars=companyName.toCharArray();
		System.out.println("Reverse String:");
		for(int i=chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}
		
	}

}
