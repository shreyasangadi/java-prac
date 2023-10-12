package java_simple;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object
		// string literal, if values are same, new object is not created, 
		// s1 is also pointed to s
		
		String s = "Arsenal is a FC";
		String s1 = "Arsenal is a FC";
		
		// new keyword, new object is create
		// here a new object is always created irrespective of value
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] arr1 = s1.split(" ");
		for(int i =0;i<arr1.length;i++)
		{
			System.out.println(i +" : " + arr1[i]);
		}
		
		String[] arr2 = s1.split("is");
		for(int i =0;i<arr2.length;i++)
		{
			System.out.println(i +" : " + arr2[i].trim());
		}
		
		// to print individual character
		for(int i =0;i<s.length();i++)
		{
			System.out.println(i +" : " + s.charAt(i));
		}
		
		//print reverse
		for(int i =s.length()-1;i>=0;i--)
		{
			System.out.println(i +" : " + s.charAt(i));
		}

	}

}
