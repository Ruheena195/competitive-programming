//package codeforces.problemset_problem_1139_B;
import java.util.*;

public class Chocolates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long res = arr[n-1], k=arr[n-1];

        for(int i=n-2;i>=0;i--){

            if(arr[i]<k){
                res += arr[i];
                k = arr[i];
            }
            else{
                k -= 1;
                res += k;
            }
            if(k<=1)
                break;
        }
        System.out.println(res);
    }    
}
