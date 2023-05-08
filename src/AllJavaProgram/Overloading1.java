package AllJavaProgram;

public class Overloading1 {
public int subtract(int a, int b) {
	
	int c= a-b;
	 
	return c;
	
	
	
}
 
public double subtract(double a, double b) {
	
	
	double c= a-b;
	
	return c;
}
	
	public static void main(String[] args) {
		
		Overloading1 v=new Overloading1();
		double result=v.subtract(12.5, 40.5);
        System.out.println("Result : "+result);
	}

}
