public class fibonacci {
public static void main(String[] args) {
    int i = 0;
    int j = 1;
    for (int count=1;count<50;count++){

        System.out.println(i);
        int temp = i + j;
        i = j;
        j = temp;

    }
}    
}
 