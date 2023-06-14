//package codeforces.problemset_problem_500_A;
import java.util.*;

public class New_Year_Transportation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];

        for(int i=1;i<n;i++)
            arr[i] = sc.nextInt();

        int index = 1;

        while(index<t){
            index += arr[index]; 
        }

        if(index==t)
            System.out.println("YES");
        else
            System.out.println("NO");

    }    
}
