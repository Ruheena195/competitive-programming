//package codeforces.problemset_problem_110_A;

import java.util.*;

public class Nearly_Lucky_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        
        // Count the Lucky numbers
        int count = 0;

        for(int i=0;i<st.length();i++){

            if(st.charAt(i)=='4' || st.charAt(i)=='7')
                count++;
        } 

        isLucky(Integer.toString(count));
    }

    public static void isLucky(String st){

        int flag =1;

        for(int i=0;i<st.length();i++){

            if(st.charAt(i)!='4' && st.charAt(i)!='7'){
                flag = 0;
                break;
            }
        }

        if(flag==0)
            System.out.println("NO");

        else
            System.out.println("YES");
    }
    
}
