import java.util.Scanner;

public class printDigitsOfNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
System.out.println("please type a number whose number of digits you would like to know ");
int number = scn.nextInt();
int printNumber = number;
        int count = 0;
        while (number>0) {
           number = number/10;
            count++;
        }
        System.out.println( printNumber+ "  has  "+count+ " digits");
    }
    
}
