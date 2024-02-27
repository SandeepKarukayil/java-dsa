import java.util.Scanner;

public class is1toNPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input a new integer");
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            // System.out.println(i);
            boolean flag = true;
            for (int j = 2; j * j <= t; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("The number is prime"+i);
            } else {
                System.out.println("number is not prime "+i);
            }

        }
    }
    
}
