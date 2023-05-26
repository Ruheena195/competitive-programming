//package codeforces.problemset_problem_791_A;

import java.util.*;

public class Bear_and_Big_Brother {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long limak = sc.nextLong();
        long bob = sc.nextLong();
        int count=0;

        while(limak <= bob){
            limak *= 3;
            bob *= 2;
            count++;
        }
        System.out.println(count);
    }
    
}
