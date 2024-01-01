package Test;

public class TwoArraysEqual {
public static void main(String[] args) {
	
	int a [] = {1,2,3};
	int b[] = {1,3,2};
	boolean status = true;
	if(a.length==b.length) {
		for(int i =0;i<a.length;i++) {
			if(a[i]==b[i]) {
				
				status = false;
			}
			
		}
		
	}else {
		status = false;
		
	}
if(status) {
	
	System.out.println("Equals");
}else {
	
	System.out.println("Not");
}
}


}
