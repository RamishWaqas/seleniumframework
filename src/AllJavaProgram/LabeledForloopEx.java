package AllJavaProgram;

public class LabeledForloopEx {

	public static void main(String[] args) {
		
		
		A:for(int i=0;i<50;i++)
		{
			
			System.out.println(i);
			
			if(i==20)
			{
				
				break A;
			}
			
		}
		
		
	}

}
