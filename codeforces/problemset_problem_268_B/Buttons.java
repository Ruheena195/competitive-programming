//package codeforces.problemset_problem_268_B;

import java.util.*;

public class Buttons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int noofLocks = sc.nextInt();
        int res = 0;

        for(int i=1;i<noofLocks;i++){
            res += (noofLocks-i)*i;
        }
        res += noofLocks;

        System.out.println(res);
    }
    
}
