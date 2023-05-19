//package codeforces.problemset_problem_144_A;
import java.util.*;

public class Arrival_of_the_General {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            
        int min_ind = 0, min = arr[0], max_ind=0, max=arr[0], res=0;

        for(int i=1;i<n;i++){
            if(min>=arr[i]){
                min = arr[i];
                min_ind = i;
            }
            else if(max<arr[i]){
                max = arr[i];
                max_ind = i;
            }
        }
        if(min_ind < max_ind)
            res = max_ind+n-1-min_ind-1;

        else
            res = max_ind+n-1-min_ind;

        System.out.println(res);
    }    
}
