//package codeforces.problemset_problem_507_A;

import java.util.*;

public class Amr_and_Music {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            pq.add(new int[]{a,i+1});
        }
        int count=0;
        int[] res = new int[n];

        while(!pq.isEmpty()){
            int[] days = pq.poll();
            k -= days[0];
            if(k<0)
                break;
            else{
                res[count++] = days[1];
            }
        }
        System.out.println(count);

        if(count==0)
            return;
            
        for(int i=0;i<count-1;i++)
            System.out.print(res[i]+" ");

        System.out.println(res[count-1]);
    }    
}
