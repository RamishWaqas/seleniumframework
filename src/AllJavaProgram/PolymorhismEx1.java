package AllJavaProgram;

public class PolymorhismEx1 {
	
	public int addition(int a,int b)
	{
		
		int c=a+b;
		return c;
		
	}
	
	
	public int addition(int a,int b,int c)
	{
		
		int d=a+b+c;
		return d;
		
		
	}
	
	
	public double addition(double a,double b,double c)
	{
		
		double d=a+b+c;
		return d;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		PolymorhismEx1 p1=new PolymorhismEx1();
		int result1=p1.addition(2, 3);
		System.out.println(result1);
		int res=p1.addition(4, 5, 6);

		System.out.println(res);
		double re=p1.addition(12.3, 23.3, 123.54);
	System.out.println(re);
	
	}

}
