package javaProblems;
import java.util.*;
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList();
		a.add(10);
		a.add(7354);
		a.add(19);
		a.add(1982);
		
		int b[] = {1,23,124,312998,1287,43948};
		
		int temp =0;
		for(int i=0;i<a.size();i++)
		{
			
			
			if (temp < a.get(i))
			{
				temp = a.get(i);
			}
		}
		
		System.out.println("biggest number is " + temp);
		
		
		
		int temp1 =0;
		for(int i=0;i<b.length;i++)
		{
			
			
			if (temp1 < b[i])
			{
				temp1 = b[i];
			}
		}
		
		System.out.println("biggest number is " + temp1);
 
	}

}
