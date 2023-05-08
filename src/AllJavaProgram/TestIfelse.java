package AllJavaProgram;

public class TestIfelse {

	public static void main(String[] args) {
		
		
		//if you have number int number=10; 
		//1st cond: if its divisble by 3 then print First
		//2nd cond: if its divisble by 5 then Print second
		//3rd cond: if itts divisble by 3 and 5 both then print First and second
		
		
		
		int i=15;
		if(i%5==0 && i%7==0)
		{
			
			System.out.println("First and Second");
		}
		
		else if(i%5==0) 
		{
			
			System.out.println("First");
			
		}
		else if(i%7==0)
		{
			
			System.out.println("Second");
		}
		
		
	}

}
