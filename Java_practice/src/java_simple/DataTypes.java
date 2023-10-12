package java_simple;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a1 = 10;
		int a3 = 6;
		int sum;
		sum = a1+a3;
		String a = "This is string Datatype";
		char b = 'b';
		double c = 10.27;
		boolean d = true;
		
		System.out.println(a + b + c +d);
		
		
		System.out.println(sum);
		
		int num;
		
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println(num+sum);
		
		
		
		
	}

}
