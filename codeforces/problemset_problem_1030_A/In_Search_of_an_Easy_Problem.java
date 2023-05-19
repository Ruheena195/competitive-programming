//package codeforces.problemset_problem_1030_A;
import java.util.*;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==1)
                flag=1;
        }

        if(flag==1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
    
}
