// Adding on to any number using Binary NOT
import java.util.*;

public class Add_NOT {
    public static int add ( int n ) {
        return -(~n) ;               //one's compliment of n becomes -(n+1) and the -ve sign makes it +ve
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive no. : ");
        int n = sc.nextInt();
        System.out.println("After adding 1 the no. is : " + add(n));
    }
}
