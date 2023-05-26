//package codeforces.problemset_problem_977_A;

import java.util.*;

public class Wrong_Subtraction {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        int k = sc.nextInt();

        while(k-- > 0){

            if(number%10 != 0)
                number -= 1;

            else
                number /= 10;
        }
        System.out.println(number);   
    }
}
