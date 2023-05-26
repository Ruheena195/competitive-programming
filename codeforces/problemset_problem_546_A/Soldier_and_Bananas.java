//package codeforces.problemset_problem_546_A;

import java.util.*;

public class Soldier_and_Bananas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        long n = sc.nextLong();
        int w = sc.nextInt();

        for(int i=1;i<=w;i++){
            n -= i*k;
        }

        long res = (n<0)? n*-1 : 0;

        System.out.println(res);
    }
    
}
