import java.util.HashMap;
import java.util.Map;

public class CheckFrequencyOfElements {
	public static void main(String[] args) {
		int input [] = {12,13,14,14,15};
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i =0;i<input.length;i++) {
			
			if(map.containsKey(input[i])){
				int count = map.get(input[i]);
				map.put(input[i], count+1);
				
			}else {
				
				map.put(input[i], 1);
			}
			
			
		}System.out.println(map);
		
		
	}
	

}
