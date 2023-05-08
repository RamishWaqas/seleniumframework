package AllJavaProgram;

public class TestHomeLoan {
	
	
	public static void main(String[] args) {
		
		BankOfAmerica b=new BankOfAmerica();
		
		double d1=b.homeLoan();
		
		System.out.println("Bank Of America Home Loan Rate==> "+d1);
		
		UnionBank u=new UnionBank();
		double re=u.homeLoan();
		
		System.out.println("Union Bank Home Loan ==> "+re);
		
	}
	
	

}
