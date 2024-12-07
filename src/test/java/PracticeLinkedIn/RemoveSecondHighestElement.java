package PracticeLinkedIn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveSecondHighestElement {

	public static void main(String[] args) {

		int[] num = { 10, 30, 20, 50, 80, 01 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {

			System.out.println(map.put(i, num[i]));

		}
//		System.out.println(map);

		int res = map.remove(num.length - 2);
		System.out.println(map);
	}

}
