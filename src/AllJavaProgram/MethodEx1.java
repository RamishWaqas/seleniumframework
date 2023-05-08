package AllJavaProgram;

public class MethodEx1 {
	
	
	
	
	
	public int addition(int a,int b)
	{
		
		
		
		int c=a+b;
		
		return c;
	}

	public static void main(String[] args) {
	
		
		
		MethodEx1 m=new MethodEx1();
		
		int result=m.addition(4, 3);
		
		int result2=m.addition(result, 5);
		
		System.out.println("Result 1 ===> "+result);
		
		System.out.println("Result 2===> "+result2);

	}

}
