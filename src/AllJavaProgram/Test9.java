package AllJavaProgram;

public class Test9 {
	
	
	
	public Test9(int a,int b)
	{
		int c=a+b;
	System.out.println("addition of two number by constrcutor ==> "+c);	
		
	}
	
	
	public int addition(int a,int b)
	{
		int c=a-b;
		
		return c;
		
	}
	

	public static void main(String[] args) {
		
		Test9 t1=new Test9(12, 4);
		
		int result=t1.addition(6, 4);
		System.out.println(result);
		
		System.out.println(result+2);
		
		
		
		
		

	}

}
