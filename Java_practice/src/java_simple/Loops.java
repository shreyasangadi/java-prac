package java_simple;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr2 = {1,2,3,4,5,6,7,8};
		int i;
		
		// Normal for loop to print
		for(i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);	
		}
		
		//normal while loop to print
		i=0;
		while(i<arr2.length)
		{
			System.out.println(arr2[i]);
			i++;
		}
		
		
		String[] name = {"hi", "I am ", "Name ", " is "};
		
		//advanced for loop to print all strings in an array
		
		for(String s: name)
		{
			System.out.println(s);
		}
		
		// print only even numbers
		for(i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2 ==0)
			{
				System.out.println(arr2[i]);	
			}
			else
			{
				System.out.println(arr2[i] + " is odd number");
			}
				
		}
		
		
		
	}
	

}
