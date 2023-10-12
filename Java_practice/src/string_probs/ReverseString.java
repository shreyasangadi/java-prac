package string_probs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "Arsenal is a football club";
		char ch = ' ';
		String nstr = " ";
		
		for(int i=0;i<str1.length();i++)
		{
			ch = str1.charAt(i);
			nstr = ch + nstr;
		}
		
		System.out.println(nstr);
		
		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		str2.reverse();
		
		System.out.println(str2);

		
	}

}
