//package codeforces.problemset_problem_723_A;

import java.util.*;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(c,Math.min(a,b));
        int max = Math.max(c,Math.max(a,b));

        System.out.println(max-min);

    }    
}
