package Test;

public class RemoveElement {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int res [] = new int [arr.length-1];
		int key = 2;
		int h =0;
		for(int i =0;i<arr.length;i++) {
			
			if(i!=key) {
				res[h] = arr[i];
				h++;
			}
		}for(int j=0;j<res.length;j++) {
			System.out.println(res[j]);
		}
	}
	
}
