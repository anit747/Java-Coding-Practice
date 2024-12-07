package Test;

import java.util.HashSet;
import java.util.Set;

public class FindingKeysInArrayString {

	public static void main(String[] args) {
		String[] str = {"My","Nime","Anit"};
		char key = 'i';
		
		int count = 0;
		 
		for(int i =0;i<str.length;i++) {
			char res [] = str[i].toCharArray();
			   for(int j = 0;j<res.length;j++) {
				   
				   if(res[j]==key) {
					   
					   count++;
				   }
				   
			   }
			
		}System.out.println(count);
		
		
		
	}
	
}
