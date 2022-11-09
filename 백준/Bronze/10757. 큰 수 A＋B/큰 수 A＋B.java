import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
           BigInteger A = sc.nextBigInteger();
           BigInteger B = sc.nextBigInteger();
           BigInteger answer =  A.add(B);
        
            System.out.println(answer);
    }
}