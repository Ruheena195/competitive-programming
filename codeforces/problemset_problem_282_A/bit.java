import java.util.*;
public class bit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-- > 0){
            
            String str = sc.next();
            if(str.charAt(0) == '+' || str.charAt(2) == '+')  x++;
            else                                              x--;                     
            
        }
        System.out.println(x);
    }
}
