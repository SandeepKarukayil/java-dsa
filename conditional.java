public class conditional {
    public static void main(String[] args) {
        // int n1 = 11;
        // int n2 = 10;

        // if (n1==n2) {
        //     System.out.println(n1+" is equal to "+n2);
        // } else if (n1 > n2) {
        //     System.out.println(n1+ " is greater than "+n2);
        // } else {
        //     System.out.println(n1+ " is smaller than "+n2);
        // }
        // grading system  question

        int marks = 80;

        if (marks>90) {
            System.out.println("Excellent marks");
        } else if(marks>80&&marks<=90) {
            System.out.println("good marks");
        }
         else if(marks>70&&marks<=80) {
            System.out.println("Fair marks");
        }
         else if(marks>60&&marks<=70) {
            System.out.println("meets expectations");
        }
        else  {
            System.out.println("Below par marks ");
        }
System.out.println("Hard work always beats smartwork");

}
    
}
