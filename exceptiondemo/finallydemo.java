package exceptiondemo;

public class finallydemo {

	public static void main(String[] args) {
		

				try {
				int a=1;
				int b=0;
				int c=a/b;
				System.out.println(c);

			}
				catch(ArithmeticException e) {
					
					System.out.println("divede by zero");
				
		}
				finally {
					System.out.println("divede by zero");
					
				}

	}

}
