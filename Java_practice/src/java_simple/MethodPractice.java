package java_simple;

public class MethodPractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodPractice a = new MethodPractice();
		a.getData();
		String z = a.returnData();
		System.out.println(z);
		
		MethodsDemo1 b = new MethodsDemo1();
		String y =  b.getUserData();
		System.out.println(y);
		
		// when static keyword is with method
		// method can be called in the same class without an object
		printData();
	}
	
	
	public void getData()
	{
		System.out.println("Hello Worls");
	}
	
	public String returnData()
	{
		return "Arsenal is in north London";
	}
	
	public static void printData()
	{
		System.out.println("Hello world");
	}
	
	
}