public class variables {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int sum = x + y;

        System.out.println("The sum of " + x + " and " + y + " is " + sum);

        int prod = x * y;
        System.out.println("Product of " + x + " and " + y + " is " + prod);
        
        // x/y y/x and x%y

        int div1 = x / y;
        int div2 = y / x;
        int mod = x % y;
        System.out.println("division 1 " + div1);
        System.out.println("division 2 " + div2);
        System.out.println("mod 1 " + mod);

        //operator priority 

        int result = x * y / x + y;
        System.out.println(result);// shows answer 30 because  */% > +-

        // to override it use round brackets 

        int resultOverride = (x * y) / (x + y);
        System.out.println(resultOverride);

    }
    
}
