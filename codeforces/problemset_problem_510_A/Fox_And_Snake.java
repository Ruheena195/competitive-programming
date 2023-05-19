//package codeforces.problemset_problem_510_A;

import java.util.*;

public class Fox_And_Snake {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //int count = 0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                if(i%2 != 0)
                    System.out.print('#');
                
                else if(i%4==0 && j==1)
                    System.out.print('#');
                
                else if(i%4!=0 && i%2==0 && j==n)
                    System.out.print('#');

                else
                    System.out.print('.');
                
            }
            System.out.println();
        }
    }    
}
