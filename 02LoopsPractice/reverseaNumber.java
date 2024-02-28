import java.util.Scanner;

public class reverseaNumber {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
System.out.println("please input a number");
    int number = scn.nextInt();

    int temp = number;
    int count = 0;
    while (number>0) {
        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;
    }
}
     
}