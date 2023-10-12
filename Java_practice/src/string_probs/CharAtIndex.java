package string_probs;

public class CharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str1 = "Arsenal is a Football Club";
		int index = 19;
		
		System.out.println(str1.charAt(index));
		
		
		String str2 = str1;
		
		int num = 5;
		
		char g = 'Z';
		
		str2 = str2.substring(0,num) + g + str2.substring(num+1);
		System.out.println(str2);
		
		StringBuilder string2 = new StringBuilder(str2);
		string2.setCharAt(index,g);
		
		System.out.println(string2);
		
		
		
		
		
		
	}

}
