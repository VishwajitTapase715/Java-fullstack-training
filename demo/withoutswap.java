package demo;

public class withoutswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("Before swaping " +a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping " +a+" "+b);
	}

}
