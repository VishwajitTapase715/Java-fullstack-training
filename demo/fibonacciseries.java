package demo;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int a=0;
		int b=1;
		
		for(int i=0;i<=num;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println("Fibonacci series  "+c);
		}
	}

}
