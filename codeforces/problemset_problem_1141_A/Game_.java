//package codeforces.problemset_problem_1141_A;
import java.util.*;

public class Game_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = solve(n,m);
        //System.out.println(ans);

        if(ans>=10000)
            System.out.println(-1);
        else
            System.out.println(ans);       
    }
    public static int solve(int n,int m){
        if(n==m)
            return 0;

        if(n>m)
            return 10000;

        int res = Math.min(solve(n*2,m) , solve(n*3,m))+1;

        return res;
    }
}
