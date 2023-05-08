package AllJavaProgram;

public class LoopEx3 {
	
	
	
	public void checkOddEven(int number)
	{
		
		if(number%2==0)
		{
			
		System.out.println("Even Number");	
		}
		else
		{
		System.out.println("Odd Number");	
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
	Label:	for(int i=1; i<100; i++)
		{
 System.out.println(i);
 
 if (i==50) {
	 
	 break Label;
	 
	
 }
 
 
 
		}
	
	}

}
