package AllJavaProgram;

public class All3loopsEx2 {

	public static void main(String[] args) {
		
		int oddcount=0;
		int evencount=0;
		for(int i=0; i<100; i++)
		{
			
			if(i%2==0)
			{
				evencount++;
				//evencount=evencount+i;
			
				//evencount=evencount+1;
			}
			
			
			else
			{
				oddcount++;
				//oddcount=oddcount+i;
				
			}
		}
System.out.println("evencount"+evencount);
System.out.println("oddcount"+oddcount);
	}

}
