package java_simple;

import java.util.Scanner;

public class InputConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		String a = s.nextLine();
		System.out.println("Entered string is " + a);
		
		int b = s.nextInt();
		System.out.println("Entered num is " + b);
		
		float c = s.nextFloat();
		System.out.println("Entered num is " + c);
		
		

	}

}
