//Swap without using any third variable 
import java.util.*;

public class Swap {
    public static void swap ( int x , int y) {
        x = x ^ y ;   // assigning a Z within x after doing XOR of x and y
        y = x ^ y ;   // now when we assign the value of y using the XOR of x assigned Z and y we get the previous x
        x = x ^ y ;   // now ehn we do XOR with x assigned Z with new y we get previous taken y
        System.out.println( " After swapping the value of x is " + x + " and y is " + y );
    }
    public static void main(String[] args) {
        swap(4, 5);
    }
    
}
