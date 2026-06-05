package demo;

public class primenumber {

    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            System.out.println("It is prime number " + num);
        } else {
            System.out.println("It is not prime number " + num);
        }
    }
}