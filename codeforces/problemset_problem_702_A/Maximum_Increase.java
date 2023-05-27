//package codeforces.problemset_problem_702_A;
import java.util.*;

public class Maximum_Increase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        int max=1, count=1;

        for(int i=1;i<N;i++){
            if(arr[i-1]<arr[i])
                count++;
            else
                count=1;

            if(count>max)
                max = count;
        }
        System.out.println(max);
    }
    
}
