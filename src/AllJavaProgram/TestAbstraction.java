package AllJavaProgram;

public class TestAbstraction extends Abstraction {

	
	
	
	public static void main(String[] args) {

		TestAbstraction t1=new TestAbstraction();
		t1.addition();
		t1.display("test");
		
	}

	
	void addition() {
		
		
		int c=10+20;
		System.out.println(c);
	}

}
