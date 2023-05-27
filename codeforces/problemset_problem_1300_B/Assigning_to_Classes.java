//package codeforces.problemset_problem_1300_B;
import java.util.*;

public class Assigning_to_Classes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int  n = sc.nextInt();
            int tot = 2*n;
            int[] arr = new int[tot];

            for(int i=0;i<tot;i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);
            
            System.out.println(arr[n]-arr[n-1]);
        }
    }    
}
