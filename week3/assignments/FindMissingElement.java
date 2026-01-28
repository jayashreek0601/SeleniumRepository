package week3.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] input= {1,3,2,8, 6, 7};
		Arrays.sort(input);
		for(int i=input[0];i<input.length;i++) {
			if (input[i - 1] != i) {
                System.out.println("Missing Number is: " + i);
                break;
		}
	}

}
}