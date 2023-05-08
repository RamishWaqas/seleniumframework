package AllJavaProgram;

public class CheckOddEven {
	
	
	
	public String checkoddevenNumber(int number)
	{
		//modulo 10%2==0==0  15/2==>7
		
		//16/2==>8
		//16%2==>0
		
		//17/2==>8
		//17%2==> 1
		
		String result="";
		
		if(number%2==0)
		{
			
			result="Even number";
			
		}
		
		else
		{
			result="odd number";
			
		}
		
		return result;
		
	}
	

	public static void main(String[] args) {
		
		
		CheckOddEven m1=new CheckOddEven();
		String result=m1.checkoddevenNumber(16);
       System.out.println(result);
	}

}
