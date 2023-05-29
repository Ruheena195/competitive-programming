//package codeforces.problemset_problem_1141_A;
import java.util.*;

public class Game_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m==n)
            System.out.println(0);

        else if(m%n != 0)
            System.out.println(-1);

        //  n * t = m -> t = m/n then t should be multiple of 2,3  

        else{
            int t = m/n;
            int count =0;
            
            while(t%2==0){
                count++;
                t /= 2;
            }
            while(t%3 == 0){
                count++;
                t /=3;
            }
            if(t != 1)
                System.out.println(-1);
            else
                System.out.println(count);
        }
        
    }
}
