package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		int[] arr={3, 2, 11, 4, 6, 7};
		List<Integer> list=new ArrayList<>();
		for(int num :arr) {
			list.add(num);
		}
		Collections.sort(list);
		int secondLargest=list.get(list.size()-2);
		System.out.println("Second largest number is: " + secondLargest);
	}

}
