package AllJavaProgram;

public class Program1 {
	
	
	public int addition(int a,int b)

	{
		int c=a+b;
		
		return c;		
		
	}
	
	
	public void additionduplicate()
	{
		
		
		int a=20;
		int b=30;
				int c=a+b;
	System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		

		Program1 p1=new Program1();
		int result=p1.addition(20, 30);
		
		System.out.println(result+50);
		p1.additionduplicate();
		
	}

}
