package week4.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int num : arr1) {
			list1.add(num);
		}
		for (int num : arr2) {
			list2.add(num);
		}
		System.out.println("Intersection values:");
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				System.out.println(list1.get(i));
			}
		}
	}

}
