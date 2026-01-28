package week3.assignments;

public class FindOccurence {

	public static void main(String[] args) {
		String input="Testleaf";
		int count=0;
		char[] chars=input.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='e') {
				count++;
			}
		}
System.out.println("Count of Character 'e': "+count);
	}

}
