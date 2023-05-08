package AllJavaProgram;

public class TestConstrcutorEx {
	
	
	public TestConstrcutorEx()
	{
		System.out.println("My Default constructor started!!");
		
	}
	
	
	public TestConstrcutorEx(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two number ==> "+c);
		
	}
	
	public TestConstrcutorEx(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition of THree number ==> "+d);
		
	}

	public static void main(String[] args) {
		
		
		TestConstrcutorEx t1=new TestConstrcutorEx();
		
		TestConstrcutorEx t2=new TestConstrcutorEx(5, 4);
		TestConstrcutorEx t3=new TestConstrcutorEx(1, 2, 3);
		
	}

}
