package Test;

public class RemoveElemen {
	
	public static void main(String[] args) {
		int arr[]  = {10,20,30,40,50};
		int key = 2;
		int h=0;
		int result [] = new int [arr.length-1];
		for(int i = 0;i<arr.length;i++) {
			if(i!=key) {
				result[h]=arr[i];
				h++;
				
			}
			
		}for(int j =0;j<result.length;j++) {
			
			System.out.println(result[j]);
		}
	}

}
