import java.util.HashMap;
import java.util.Map;

public class DuplicateBlockWords {
	
	public static void main(String[] args) {
		String str = "This is Java Java";
		
		String[] words = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0;i<words.length;i++) {
			
			if(map.containsKey(words[i])) {
				int count = map.get(words[i]);
				map.put(words[i], count+1);
				
			}else {
				
				map.put(words[i], 1);
				
			}
			
		}
		System.out.println(map);
	}

}
