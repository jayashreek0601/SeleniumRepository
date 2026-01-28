package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		// Declare an array
		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };
		// Add array elements to the list
		List<Integer> list = new ArrayList<Integer>();
		for (int num : arr) {
			list.add(num);
		}
		// Arrange the list in ascending order
		Collections.sort(list);
		// Check for gaps in the sequence
		for (int i = 0; i < list.size() - 1; i++) {
			int current = list.get(i);
			int next = list.get(i + 1);
			if (current + 1 != next) {
				for (int missing = current + 1; missing < next; missing++) {
					System.out.println("Missing number: " + missing);
				}
			}
		}

	}

}
