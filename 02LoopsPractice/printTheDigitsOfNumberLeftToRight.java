import java.util.Scanner;

public class printTheDigitsOfNumberLeftToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int divisor = (int) Math.pow(10, count - 1);
        while (divisor!=0) {
            int quotient = number / divisor;
            System.out.println(quotient);
            number = number % divisor;
            divisor = divisor / 10;
        }
    }
    
}
