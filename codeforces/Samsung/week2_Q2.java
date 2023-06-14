//package codeforces.Samsung;
import java.util.*;

public class week2_Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[N];
            ArrayList<int[]> lt = new ArrayList<>();

            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                lt.add(new int[]{arr[i],i});
            }

            int res = 0;

            // for(int i=0;i<N;i++){
            //     for(int j=i+1;j<N;j++){
            //         res = Math.max(res, Math.abs(i - j) * Math.min(arr[i],arr[j]));
            //     }
            // }

            Collections.sort(lt, (a,b)->b[0]-a[0]);
            
            int result = 0;

            for(int i=0;i<lt.size()-1;i++){
                int[] a = lt.get(i);
                int[] b = lt.get(i+1);
                int prod = Math.abs(a[1] - b[1]) * Math.min(a[0],b[0]); 
                result = Math.max(result, prod);
            }
             System.out.println(res);
		}
	
    }
    
}
