package AllJavaProgram;

public class LabeledforloopEx3 {

	public static void main(String[] args) {
		
		int arr[]= {12,67,98,33,55,7,9,5};
		int index=0;
		b:for(int A: arr)
		{
			
			if(A==55)
			{
				
				index++;
			break b;	
			}
			else
			{
				index++;
			}
			
			
		}
		
		System.out.println("index value "+index);
		
	}

}
