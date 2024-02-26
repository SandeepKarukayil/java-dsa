import java.util.Scanner;

public class takingInputs {
    public static void main(String[] args) {

        //taking input as integer
        Scanner scn = new Scanner(System.in);
System.out.println("What is your age? ");
        // int age = scn.nextInt();    

        // System.out.println("Your age is "+age);
        // taking input as  string 
        // System.out.println(" what is your name ?");
        // String name = scn.nextLine();
        
        // System.out.println("Your name is " + name + " and age is " + age); // this will only take age and not name 
        
        // to take string and number both we will need to do parse int 
        System.out.println("What is your age? ");
        int age = Integer.parseInt(scn.nextLine());
        System.out.println(" what is your name ?");
        String name = scn.nextLine();
        System.out.println("Your name is " + name + " and age is " + age);


        
    }
}
