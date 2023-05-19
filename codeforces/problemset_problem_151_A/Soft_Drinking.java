//package codeforces.problemset_problem_151_A;

import java.util.*;

public class Soft_Drinking {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        long z = (k*l)/nl;
        long y = c*d;
        long min = p/np;

        min = Math.min(min,y);
        min = Math.min(min,z);

        System.out.println((int)min / n);

    }    
}
