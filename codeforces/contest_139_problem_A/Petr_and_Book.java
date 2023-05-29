//package codeforces.contest_139_problem_A;
import java.util.*;

public class Petr_and_Book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] week = new int[7];
        for(int i=0;i<7;i++)
            week[i] = sc.nextInt();

        int  it=0;

        while(n>0){
            
            if(it==7)
                it=0;
            
            n -= week[it++];
        }
        System.out.println(it);
    }
    
}
