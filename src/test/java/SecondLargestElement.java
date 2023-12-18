
public class SecondLargestElement {

	public static void main(String[] args) {
		int temp;
		int input[] = {98, 23,22,45,67};
		for(int i = 0;i<input.length;i++) {
			for(int j =i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp =input[i];
					input[i]=input[j];
					input[j]= temp;
					//22,23,45,67,98
					
				}
				
			}
			
			
		}System.out.println(input[input.length-2]);
		
		
	}
}
