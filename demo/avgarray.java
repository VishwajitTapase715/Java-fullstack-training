package demo;

public class avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        int arr[] = {10, 20, 30, 40, 50};
		        int sum = 0;

		        for (int i = 0; i < arr.length; i++) {
		            sum = sum + arr[i];
		        }

		        double average = (double) sum / arr.length;

		        System.out.println("Average = " + average);
		    }
		
	}


