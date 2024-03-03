import java.util.Scanner;

public class inverseDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int inverse = 0;
        int originalPosition = 1;
     while (number!=0) {
         int originalDigit = number % 10;
         int inversePosition = originalDigit;
         int inverseDigit = originalPosition;

         inverse = inverse + inverseDigit * (int) Math.pow(10, inversePosition - 1);
         number = number / 10;
         originalPosition++;
     }
System.out.println(inverse);

    }
}
