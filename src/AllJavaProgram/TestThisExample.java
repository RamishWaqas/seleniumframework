package AllJavaProgram;

public class TestThisExample {
	
	int a;
	
	
	public void displayNumber(int a)
	{
	
		this.a=a;
		
	}
	
	

	public static void main(String[] args) {
	
		TestThisExample t1=new TestThisExample();
		
		t1.displayNumber(10);
		
		System.out.println(t1.a);

	}

}
