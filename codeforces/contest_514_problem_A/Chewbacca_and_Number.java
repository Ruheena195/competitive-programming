// package codeforces.contest_514_problem_A;

import java.util.*;

public class Chewbacca_and_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0, t = 1;
        
        while(x > 0){

            int temp = x%10;
            x = x/10;
            temp = (temp < (9-temp)) ? temp : (9-temp);
            res = (temp * t) + res;
            t *= 10;
        }
        System.out.println(res);
    }   
}

