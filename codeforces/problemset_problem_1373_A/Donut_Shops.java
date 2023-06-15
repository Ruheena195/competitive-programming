//package codeforces.problemset_problem_1373_A;
import java.util.*;

public class Donut_Shops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a<c)
                System.out.print(1+" ");
            else
                System.out.print(-1+" ");

            if(a > (1.0*c/b))
                System.out.println(b);
            else
                System.out.println(-1);

        }
    }    
}
