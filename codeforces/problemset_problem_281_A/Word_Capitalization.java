//package codeforces.problemset_problem_281_A;

import java.util.*;
import java.lang.*;

public class Word_Capitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        if(str.charAt(0)>=97 && str.charAt(0)<=122){
            int ch = str.charAt(0)-32;
            sb.append((char)ch);
            System.out.println(sb.toString() + str.substring(1, str.length()));
        }
        else
            System.out.println(str);        

    }
    
}
