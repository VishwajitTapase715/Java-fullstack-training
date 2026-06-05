package demo;

public class powerofnumberCUBEofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2;
		int exponent=3;
		int result=1;
		
		for(int i=1;i<=exponent;i++) {
			
			result=result*base;
		}
		System.out.println("Power = " + result);

	}

}
