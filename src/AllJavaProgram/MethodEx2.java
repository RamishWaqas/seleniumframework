package AllJavaProgram;

public class MethodEx2 {
	
	public String checkStudentMarks(int score)
	{
		String result="";
		if(score>=60 && score<70)
		{
			
			result="D grade";
		}
		
		else if(score>=70 && score<80)
		{
			
			result="C Grade";
		}
		
		else if(score>=80 && score<90)
		{
			
			result="B Grade";
			
		}
		
		else if(score>=90 && score<95)
		{
			result="A Grade";
	
		}
		
		else {
			result="Fail";
		}
		
		return result;
		
		
		
	}

	public static void main(String[] args) {
		
		MethodEx2 m2=new MethodEx2();
		String result=m2.checkStudentMarks(70);
		
				System.out.println(result);
		
		

	}

}
