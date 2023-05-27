//package codeforces.problemset_problem_1368_A;
import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int count=0;

            while(a<=n && b<=n){
                int min = Math.min(a,b);
                int max = Math.max(a,b);
                min += max;
                count++;
                a=min;
                b=max;
            }
            System.out.println(count);
        }
    }
    
}
