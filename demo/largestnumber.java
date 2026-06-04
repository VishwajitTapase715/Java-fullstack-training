package demo;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        int arr[] = {10, 25, 8, 45, 32};

		        int largest = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > largest) {
		                largest = arr[i];
		            }
		        }

		        System.out.println("Largest element = " + largest);
		    }
		
	}
	

