//package codeforces.problemset_problem_1433_A;
import java.util.*;

public class Boring_Apartments {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){
            String st = sc.next();
            int len = st.length();

            int value = st.charAt(0)-'0';

            int res = (value-1)*10 + (len*(len+1))/2;

            System.out.println(res);
        }
    }    
}
