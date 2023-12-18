import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfWord {
	public static void main(String[] args) {
		String str = "Testiinng";
		char[] c = str.toCharArray();
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		for(int i = 0;i<str.length();i++) {
			
			if(map.containsKey(c[i])) {
				int count = map.get(c[i]);
				map.put(c[i], count+1);
				
			}else {
				map.put(c[i],1);
			}
			
		}System.out.println(map);
		
	}

}
