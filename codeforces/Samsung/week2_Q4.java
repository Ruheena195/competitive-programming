//package codeforces.Samsung;
import java.util.*;

public class week2_Q4 {
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[][] mat = new int[N][N];

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    mat[i][j] = sc.nextInt();
                }
            }

            int Q = sc.nextInt();
            
            for(int i=0;i<Q;i++){
                int type = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                if(type == 0){
                    int count = getCount(mat,a,b,c,d);
                    System.out.println(count);
                }
                else
                    rotate(mat,a,b,c,d);

            }
		}
    }
    public static int getCount(int[][] mat, int a, int b, int c, int d){
        int[] freq = new int[8];

        for(int i=0;i<8;i++)
            freq[i] = 0;

        for(int i=a;i<=c;i++){
            for(int j=b;j<=d;j++){
                freq[mat[i][j]]++;
            }
        }
        // for(int i=0;i<8;i++)
        //     System.out.print(freq[i]+" ");

        // System.out.println();

        int max=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<8;i++){

            if(freq[i]>max)
                max = freq[i];

            if(freq[i] < min)
                min = freq[i];
        }
        //System.out.println(max+" "+min);

        return (max-min);

    }  
    public static void rotate(int[][] mat, int a, int b, int c, int d){

        for(int i=a;i<=c;i++){
            for(int j=b;j<=d;j++){
                mat[i][j] = (mat[i][j]+1)%8;
            }
        }
        
    }    
}
