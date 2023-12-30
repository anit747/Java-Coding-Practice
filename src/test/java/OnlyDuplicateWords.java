import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OnlyDuplicateWords {
	public static void main(String[] args) {
		String str = "This is Java Java Java";
		String [] split = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<split.length;i++) {
			
			if(map.containsKey(split[i])) {
				
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}else {
				
				map.put(split[i], 1);
			}
			
		}
		Set<String> set = map.keySet();
		
		for(String words: set) {
			
			if(map.get(words)>1) {
				System.out.println(words);
				
			}
		}
		
	}

}
