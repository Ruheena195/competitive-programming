//package codeforces.problemset_problem_1199_A;
import java.util.*;

public class City_Day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        

        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i-1; j>=0 && j>=i-x;j--){
                if(arr[i]>arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                continue;

            flag=0;
            
            for(int j=i+1;j<n&&j<=i+y;j++){
                if(arr[i]>arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i+1);
                return;
            }
        }

    }
}
