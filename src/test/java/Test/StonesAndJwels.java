package Test;

public class StonesAndJwels {
public static void main(String[] args) {
	
	String stones = "aAAbbbb";
	String jewels = "aA";
	int count =0;
	char [] ston =  stones.toCharArray();
	
	char [] jewel = jewels.toCharArray();
	
	
	for(int i =0;i<ston.length;i++) {
		for(int j=0;j<jewel.length;j++) {
			if(ston[i]==jewel[j]) {
				count ++;
				
			}
			
		}
		
		
		
	}System.out.println(count);
	
	
	
}
}
