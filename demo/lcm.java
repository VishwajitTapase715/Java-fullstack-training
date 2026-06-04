package demo;


public class lcm {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;
        int lcm;

        for (lcm = num1 > num2 ? num1 : num2; ; lcm++) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }
}
