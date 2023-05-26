//package codeforces.problemset_problem_116_A;

import java.util.*;

public class Tram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stops = sc.nextInt();
        int capacity = Integer.MIN_VALUE;
        int current = 0;

        for(int i=0; i<stops;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            current += b - a;
            capacity = Math.max(capacity, current);
        }
        System.out.println(capacity);
    }
    
}
