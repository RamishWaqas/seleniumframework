package AllJavaProgram;

public class ElseifEx1 {

	public static void main(String[] args) {
		
		
		int score=70;
		
		// 60-->D Grade,70-->C,80--B,90-A,<60-->Fail
		
		//&& --> AND operator
		if(score>=60 && score<70)
		{
			
		
			System.out.println("D grade");
		}
		else if(score>=70 && score<80)
		{
			
			System.out.println("C grade");
			
		}
		
		else if(score>=80 && score<90)
		{
			
			
			System.out.println("B grade");
		}
		
		else if(score>=90 && score<95)
		{
			
			System.out.println("A grade");
		}	
		
		else
		{
			
			System.out.println("Fail!");
		}
		
		

	}

}
