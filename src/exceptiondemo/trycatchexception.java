package exceptiondemo;
// demo of one try wth multiple catchblock.
public class trycatchexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=1;
		int b=0;
		int c=a/b;
		System.out.println(c);

	}
		catch(ArithmeticException e) {
			
			System.out.println("divede by zero");
		}

}
}