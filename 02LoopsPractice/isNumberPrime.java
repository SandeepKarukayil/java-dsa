import java.util.Scanner;

public class isNumberPrime {
    public static void main(String[] args) {
        System.out.println("Hello Sandeep");

        Boolean flag = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please type a number ");
        int n = scn.nextInt();
        int i = 2;

        while (i < n) {
            if (n % i == 0) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag==true) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }
    }
    
}
