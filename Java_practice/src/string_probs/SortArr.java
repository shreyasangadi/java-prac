package string_probs;

import java.util.Arrays;

public class SortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "qwertyuiopasdfghjklzxcvbnm ";
		String str2 = sortString(str1);
		
		System.out.println(str2);
		
	}
	
	
	public static String sortString(String str1)
	{
		
		char tempArray[] = str1.toCharArray();
		Arrays.sort(tempArray);
		
		String str2 = new String(tempArray);
		
		
		return str2;
	}

}
