// package codeforces.contest_514_problem_A;

import java.util.*;

public class Chewbacca_and_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<x.length();i++){

            int temp = x.charAt(i) - '0';
            temp = (temp < 9-temp) ? temp : 9-temp;
            sb.append(temp);            
        }
        int temp = x.charAt(0) - '0';

        if(temp!=9)
            temp = (temp < 9-temp) ? temp : 9-temp;
        
            sb.insert(0,temp); 

        long res = Long.parseLong(sb.toString());

        System.out.println(res);
    }   
}

