package java_simple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList();
		// create object of a class -object.method
		a.add("Arsenal");
		a.add("is");
		a.add("football");
		a.add("club");
		
		System.out.println(a.get(3));
		a.get(2);
		a.remove(1);
		
		int i;
		for(i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("**************");
		
		for(String z:a)
		{
			System.out.println(z);
		}
		
		//check if item is present in arraylist
		boolean y = a.contains("club");
		System.out.println(y);
		
		
		String[] name = {"hi", "I am ", "Name ", " is "};
		List<String> nameArrayList = Arrays.asList(name);
		
		boolean x = nameArrayList.contains("is");
		System.out.println(x);
		
		
		
		
		
	}

}
