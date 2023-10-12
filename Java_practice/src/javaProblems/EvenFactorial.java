package javaProblems;

public class EvenFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 8;
		int fib[] = new int[2*num+1];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i =2;i<2*num;i++)
		{
			fib[i] = fib[i-1] + fib[i-2]; 
		}
		
		for (int i = 0;i<2*num;i++)
		{
			if(i%2==0)
			System.out.println(" "+fib[i] );
		}
	}

}
