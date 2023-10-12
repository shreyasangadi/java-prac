package javaProblems;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		int ans = FactorialRet(num);
		System.out.println(ans);
	}
	
	public static int FactorialRet(int n)
	{
		int res=1,i;
		
		for(i=1;i<=n;i++)
			res = res*i;
		
		return res;
	}

}
