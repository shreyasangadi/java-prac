package javaProblems;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 12;
		int b = 21;
		
		int biggest = (a>b) ? a: b;
		
		while(true)
		{
			if(biggest % a ==0 && biggest % b ==0 )
				break;
			biggest++;
			System.out.println(biggest);
			
		}

	}

}
