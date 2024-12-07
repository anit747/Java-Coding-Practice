package Test;

import java.util.HashMap;
import java.util.Map;

public class OnlyUnique {
	public static void main(String[] args) {
		int num[] = { 1, 1, 2, 1, 3, 3, 3 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {

			if (map.containsKey(num[i])) {

				int count = map.get(num[i]);
				map.put(num[i], count + 1);

			} else {

				map.put(num[i], 1);

			}

		}
		for (Map.Entry<Integer, Integer> fin : map.entrySet()) {
			
			if(fin.getValue()==1) {
				System.out.println(fin.getKey());
			}

		}
	}
}
