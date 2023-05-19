//package codeforces.problemset_problem_1352_A;

import java.util.*;

public class Sum_of_Round_Numbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int num = sc.nextInt();
            int m=1, count=0;
            StringBuilder sb = new StringBuilder();

            while(num>0){

                int temp = num%10;
                num = num/10;
            
                if(temp!=0){
                    count++;
                    sb.append(temp*m+" ");  
                }
                m *=10;              
            }
            System.out.println(count);
            System.out.println(sb.toString());
        }
    }    
}
