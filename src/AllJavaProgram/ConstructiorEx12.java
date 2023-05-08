package AllJavaProgram;

public class ConstructiorEx12 {
	
	public ConstructiorEx12()
	{
		this(2,7);
		System.out.println("Default Constructor!!");
	}

	
	public ConstructiorEx12(int a,int b)
	{
		int c=a+b;
		
		System.out.println(c);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructiorEx12 t1=new ConstructiorEx12();
		
		
		

	}

}
