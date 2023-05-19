//package codeforces.problemset_problem_263_A;

import java.util.*;

public class Beautiful_Matrix {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a=3, b=3, x=0, y=0, res=0;
        
        for(int i=1; i<=5;i++){

            for(int j=1;j<=5;j++){

                int e = sc.nextInt();
                if(e==1){
                    x = i;
                    y = j;
                }
            }
        }
        res = Math.abs(x-a) + Math.abs(y-b);

        System.out.println(res);
    }    
}
