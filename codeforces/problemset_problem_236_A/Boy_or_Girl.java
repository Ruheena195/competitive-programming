//package codeforces.problemset_problem_236_A;

import java.util.*;

public class Boy_or_Girl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] alp = new int[26];
        int count=0;

        for(int i=0;i<str.length();i++){
            if(alp[str.charAt(i)-'a'] == 0){
                alp[str.charAt(i)-'a'] = 1;
                count++;
            }
        }
        if(count%2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }    
}
