//package codeforces.problemset_problem_136_A;

import java.util.*;

public class Presents {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[N+1];

        for(int i=1;i<=N;i++)
            res[arr[i]] = i;

        for(int i=1;i<=N;i++)
            System.out.print(res[i]+" ");

    }
    
}
